package com.koreait.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import com.koreait.test.DBConnect;

public class Ex07_logout {
	public static void main(String[] args) {
	Connection conn = null;
	PreparedStatement ps = null;
	
	try {
		conn = DBConnect.getConnection();
		String sql = "update member set login = 'no' where id = ? AND pw = ? AND login='yes'";		
		ps = conn.prepareStatement(sql);
		ps.setString(1, JOptionPane.showInputDialog("아이디를 입력하세요"));
		ps.setString(2, JOptionPane.showInputDialog("비밀번호를 입력하세요"));
		int result = ps.executeUpdate();
		System.out.println(result>0 ? "성공" : "로그인 상태가 아닙니다.");
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		try {
			if( ps != null ) {
				ps.close();
			}
			if ( conn != null ) {
				conn.close();
			} 
		}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

