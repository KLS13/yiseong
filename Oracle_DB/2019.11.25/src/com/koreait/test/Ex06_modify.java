package com.koreait.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.koreait.test.DBConnect;

public class Ex06_modify {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String inputId = "";
		String inputPw = "";
		String update = "";

		
		try {
			conn = DBConnect.getConnection();

			
			String sql = "select * from member where id = ? AND pw = ?";		
			ps = conn.prepareStatement(sql);
			inputId = JOptionPane.showInputDialog("아이디입력");
			inputPw = JOptionPane.showInputDialog("비밀번호입력");
			ps.setString(1,inputId);
			ps.setString(2,inputPw);
			rs = ps.executeQuery();
				if(rs.next()) {
				System.out.println("로그인 성공");
				ps.close();
				rs.close();
			}
			update = JOptionPane.showInputDialog("성명 수정은 1 , 비밀번호 수정은 2 입력해주세요");
			
			if(update.equals("1")) {
				sql = "update member set name = ? where id = ?";		
				ps = conn.prepareStatement(sql);
				ps.setString(1, JOptionPane.showInputDialog("수정할 성명 변경"));
				ps.setString(2,inputId);
				int result = ps.executeUpdate();
				System.out.println(result>0 ? "수정성공" : "수정실패");
			}else if(update.equals("2")) {
				sql = "update member set pw = ? where id = ?";		
				ps = conn.prepareStatement(sql);
				ps.setString(1, JOptionPane.showInputDialog("수정할 비밀번호 변경"));
				ps.setString(2, inputId);
				int result = ps.executeUpdate();
				System.out.println(result>0 ? "수정성공" : "수정실패");
			}
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
