package com.koreait.ex;

import java.sql.Connection;
import java.sql.Statement;

import com.koreait.db.DBConnect;

public class Ex02_update {

	public static void main(String[] args) {

		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DBConnect.getConnection();
			st = conn.createStatement();
			String sql = "update person set age = age + 1 where name = 'alice'";
			int result = st.executeUpdate(sql);
			if (result > 0) {
				System.out.println("업데이트 성공!");
			} else {
				System.out.println("업데이트 실패!");
			}
			conn.commit();
		} catch (Exception e) {
			e.printStackTrace();
			try { 
				if (conn != null) {
					conn.rollback(); 
					} 
				} catch (Exception e2) { 
					
				}
		} finally {
			try {
				if (st != null) { st.close(); }
				if (conn != null) { conn.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}





