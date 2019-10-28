package com.koreait.ex;

import java.sql.Connection;
import java.sql.Statement;

import com.koreait.db.DBConnect;

public class Ex03_delete {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DBConnect.getConnection();
			st = conn.createStatement();
			String sql = "delete from person where addr = 'seoul'";
			int result = st.executeUpdate(sql);
			System.out.println(result > 0 ? "성공" : "실패");
			conn.commit();
		}catch(Exception e) {
			try { if(conn != null) {
				conn.rollback();
			}
		}catch(Exception e2) {
			}
		}finally {
			try {
			if(st != null) { 
				st.close();
			}
			if(conn != null) {
				conn.close();
			}
				}catch(Exception e) {
			}
		}
	}	
}


