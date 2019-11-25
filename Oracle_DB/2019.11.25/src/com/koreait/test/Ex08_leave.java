package com.koreait.test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import com.koreait.test.DBConnect;

public class Ex08_leave {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		String inputId = "";
		try {
			conn = DBConnect.getConnection();

			String sql = "select * from member where id = ?";		
			ps = conn.prepareStatement(sql);
			inputId = JOptionPane.showInputDialog("아이디 입력");
			ps.setString(1,inputId);
			rs = ps.executeQuery();
				if(rs.next()) {
					ps.close();
					rs.close();
				}
				sql = "delete from member where pw = ? and id = ?";		
				ps = conn.prepareStatement(sql);
				ps.setString(1,JOptionPane.showInputDialog("삭제할 계정의 비밀번호 입력 : "));
				ps.setString(2,inputId);
				int result = ps.executeUpdate();
				if(result > 0) {
					System.out.println("비밀번호 일치확인. 계정삭제완료");
				}else {
					System.out.println("비밀번호 불일치");
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