package com.koreait.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

public class Ex03_join {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "insert into member values" +
			"(member_seq.nextval, ?, ?, ?, sysdate, 'no', 'no')";
			ps = conn.prepareStatement(sql);
			ps.setString(1, JOptionPane.showInputDialog("이름을 입력하세요"));
			ps.setString(2, JOptionPane.showInputDialog("아이디를 입력하세요"));
			ps.setString(3, JOptionPane.showInputDialog("비밀번호를 입력하세요"));
			int result = ps.executeUpdate();
			System.out.println(result>0 ? "회원가입 성공" : "회원가입 실패");
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

