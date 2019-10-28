package com.koreait.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.koreait.db.DBConnect;

public class Ex01_create_table {

	public static void main(String[] args) {
		
		// try - catch 시작 전에 Connection, PreparedStatement, ResultSet 선언
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "create table buy (" +
						"buy_no number primary key," + 
						"no number references member(no), " +
						"pno number not null, " + 
						"ea number default 1 not null)";
			ps = conn.prepareStatement(sql);
			ps.execute();				// 그 외
			// ps.executeQuery();		// select 문
			// ps.executeUpdate();		// insert, update, delete 문
			ps.close();
			
			sql = "create sequence buy_seq";
			ps = conn.prepareStatement(sql);
			ps.execute();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {	
			try {
				if (ps != null) ps.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
