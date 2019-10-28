package com.koreait.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.koreait.db.DBConnect;

public class Ex01_insert {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			
			// 1. 고정된 값을 사용하는 sql
			// String sql = "insert into student (no, name, addr) values (1, 'alice', 'seoul')";
			
			// 2. 변하는 값을 사용하는 sql
			String sql = "insert into student (no, name, addr) values (?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 5);
			ps.setString(2, "natasha");
			ps.setString(3, "guri");
			
			int result = ps.executeUpdate();
			System.out.println(result > 0 ? "삽입성공" : "삽입실패");
			conn.commit();
		} catch (Exception e) {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}

/*
 package com.koreait.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.koreait.db.DBConnect;

public class Ex01_insert {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "insert into student (no, name, addr) values (5, 'natasha', 'guri')";
			ps = conn.prepareStatement(sql);
			int result = ps.executeUpdate();
			System.out.println(result > 0 ? "삽입성공" : "삽입실패");
			// conn.commit();
		} catch (Exception e) {
			// e.printStackTrace();
		} finally {
			try {
				if (ps != null) { ps.close(); }
				if (conn != null) { conn.close(); }
			} catch (Exception e) {
				// e.printStackTrace();
			}
		}

	}

}
*/
