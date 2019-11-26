package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Ex07_logout {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			// DB 연결
			conn = DBConnect.getConnection();
			
			// 변수 선언
			String sql = "";
			String id = "";
			String login = "";
			int result = 0;
			
			// 로그아웃할 아이디 입력
			id = JOptionPane.showInputDialog("로그아웃할 아이디 입력!");
			
			// 로그아웃할 아이디 확인
			sql = "select login from member where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			if ( !rs.next() ) {
				JOptionPane.showMessageDialog(null, "로그아웃할 아이디를 확인할 수 없습니다.");
				return;
			}
			
			// 로그인 상태인가!
			login = rs.getString(1);
			if ( login.equals("yes") ) {
				sql = "update member set login = 'no' where id = ?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, id);
				result = ps.executeUpdate();
				JOptionPane.showMessageDialog(null, result > 0 ? id + "님 로그아웃 완료!" : "실패");
			} else {
				JOptionPane.showMessageDialog(null, id + "님은 로그인되지 않은 사용자입니다!");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if ( rs != null ) { rs.close(); }
				if ( ps != null ) { ps.close(); }
				if ( conn != null ) { conn.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
