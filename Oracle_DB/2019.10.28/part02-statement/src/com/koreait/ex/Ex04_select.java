package com.koreait.ex;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.koreait.db.DBConnect;

public class Ex04_select {

	public static void main(String[] args) {
		Connection conn = null;
		Statement st = null;
		// select 의 결과는 ResultSet 이다.
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			st = conn.createStatement();
			String sql = "select * from person";
			// executeQuery(sql) : select 문에서 사용
			rs = st.executeQuery(sql);
			/* rs에 저장된 데이터 출력
			 	- row 단위로 데이터를 읽어 들인다.
			 	- 남아 있는 row 확인은 next() 메소드를 이용
			 	- row는 column의 집합이므로 각 column 별로 분리하기 위한 getter 가 존재한다.
			 	- name varchar2(20) : rs.getString(1) 또는 rs.getString("name");
			 	- age int : rs.getInt(2) 또는 rs.getInt("age");
			 	- addr varchar2(40) : rs.getString(3) 또는 rs.getString("addr");
			 */
			while( rs.next() ) {
				System.out.print(rs.getString(1) + ", \t");
				System.out.print(rs.getInt(2) + ", \t");
				System.out.println(rs.getString(3));
			}
			//select 는 commit 이 필요없다
		}catch ( Exception e ) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close(); 
					}
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
