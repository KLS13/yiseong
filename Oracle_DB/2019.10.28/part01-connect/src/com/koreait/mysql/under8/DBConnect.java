package com.koreait.mysql.under8;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

	// MySql 8.0 미만 버전에서 사용
	
	// Connection conn = DBConnect.getConnection();
	
	public static Connection getConnection() throws Exception {
		
		// 1. mysql jdbc 드라이버 로드
		Class.forName("com.mysql.jdbc.Driver");
		
		// 2. 접속 정보 준비
		String user = "root";		// mysql 의 시스템 계정
		String password = "1111";	// mysql 설치할 때 입력하는 비밀번호
		String url =  "jdbc:mysql://localhost:3306/DB이름";
		
		// 3. 접속 정보 리턴
		return DriverManager.getConnection(url, user, password);
		
	}
	
}
