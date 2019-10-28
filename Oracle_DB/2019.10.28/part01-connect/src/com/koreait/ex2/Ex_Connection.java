package com.koreait.ex2;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Ex_Connection {

	public static void main(String[] args) {

		Connection conn = null;
		
		try {
			conn = DBConnect.getConnection();
			JOptionPane.showMessageDialog(null, "DB 접속 성공!");
			conn.close();
		} catch (ClassNotFoundException e) {
			JOptionPane.showMessageDialog(null, "jdbc 드라이버 오류");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "DB 연결 오류");
		}	
	}
}
