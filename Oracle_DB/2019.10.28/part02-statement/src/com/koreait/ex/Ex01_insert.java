package com.koreait.ex;
import java.sql.Connection;
import java.sql.Statement;

import com.koreait.db.DBConnect;

public class Ex01_insert {

	public static void main(String[] args) {
	
		Connection conn = null;
		Statement st = null;
		
		try {
			conn = DBConnect.getConnection();
			st = conn.createStatement();
			
			//쿼리 작성
			String sql = "insert into person values('andy', 50, 'mapo')";  // sql문 마지막 세미콜론 생략
			//쿼리 날리기(DB로 SQL 전달)
			int result = st.executeUpdate(sql);
			//executeUpdate : insert , update, delete문 날릴때.
			//삽입에 성공하면 1, 실패하면 0 이 반환
			if(result == 1 ) {  
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(st != null) {
					st.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
