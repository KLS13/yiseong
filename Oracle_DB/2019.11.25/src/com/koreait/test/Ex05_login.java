package com.koreait.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import com.koreait.ex.DBConnect;

public class Ex05_login {
		public static void main(String[] args) {
			Connection conn = null;
			PreparedStatement ps = null;
			ResultSet rs = null;
			
			int chance = 0;
			String inputId = "";
			try {
				conn = DBConnect.getConnection();
				while(true) {
				String sql = "select * from member where id = ?";		
				ps = conn.prepareStatement(sql);
				inputId = JOptionPane.showInputDialog("아이디 입력");
				ps.setString(1,inputId);
				rs = ps.executeQuery();
					if(rs.next()) {
						rs.close();
						break;
				}
			}
					
				while(true) {
					String sqlpw = "select * from member where pw = ? AND locked='no' ";		
					ps = conn.prepareStatement(sqlpw);
					ps.setString(1,JOptionPane.showInputDialog("비밀번호 입력 : "));
					rs = ps.executeQuery();
					if(rs.next()) {
						System.out.println("아이디와 비밀번호 일치확인");
						ps.close();
						rs.close();
						String sqllogin = "update member set login = 'yes' where id= ?";
						ps = conn.prepareStatement(sqllogin);
						ps.setString(1,inputId);
						int result = ps.executeUpdate();
						System.out.println(result > 0 ? "로그인완료" : "로그인오류");
						break;					
					}else if(chance>=4) {
						ps.close();
						rs.close();
						String sqllocked = "update member set locked = 'yes' where id= ?";
						ps = conn.prepareStatement(sqllocked);
						ps.setString(1,inputId);
						int result = ps.executeUpdate();
						System.out.println(result > 0 ? "계정중지" : "계정중지오류");
						break;
					}else {
						chance++;
						continue;
					}
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