package com.koreait.ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/*
 ORCLE jdbc를 프로젝트에 등록
 	1. 프로젝트 우클릭
 	2. Build path - ConfigureBuild Path
 	3. Libraries 탭
 	4. Add External JARs
 	5. ojdbc6_g.jar 파일 찾아서 선택
 */

public class Ex_Connection {

	public static void main(String[] args) {
		
		// 1. Connection 인스턴스
		Connection conn = null;
		
		try {
			// 2. Oracle jdbc 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 3. 접속 정보 생성
			String user = "james";
			String password = "bond";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			// 4. DriverManager : 자바를 오라클 jdbc에 연결시켜주는 클래스
			conn = DriverManager.getConnection(url, user, password);
			// 5. 확인 메세지
			JOptionPane.showMessageDialog(null, " DB접속 성공 ! ");
			// 6. 접속 종료
			conn.close();
		}catch(ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "jdbc 드라이버 오류");
		}catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "DB 연결 오류");
		}
	}
}
