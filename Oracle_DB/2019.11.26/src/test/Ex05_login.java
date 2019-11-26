package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Ex05_login {

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
			String login = "";
			String locked = "";
			String id = "";
			String pw = "";
			int count = 0;
			int result = 0;
			
			JOptionPane.showMessageDialog(null, "로그인입니다.\n아이디와 비밀번호를 입력하세요!");
			
			// 아이디 입력
			while (true) {
				id = JOptionPane.showInputDialog("아이디 입력!");
				sql = "select login, locked from member where id = ?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, id);
				rs = ps.executeQuery();
				
				// 아이디가 있는가?
				if ( rs.next() ) {
					// 이미 로그인중인가?
					login = rs.getString(1);
					if ( login.equals("yes") ) {
						JOptionPane.showMessageDialog(null, id + "님은 이미 로그인중입니다!");
						return;
					}
					// 중지계정인가?
					locked = rs.getString(2);
					if ( locked.equals("yes") ) {
						JOptionPane.showMessageDialog(null, id + "님은 중지계정입니다. 다른 아이디를 입력하세요!");
					} else {
						break;
					}
				}
				// 아이디가 없는가?
				else {
					int yesNo = JOptionPane.showConfirmDialog(null, id + "는 없는 아이디입니다.\n다른 아이디로 로그인을 계속할까요?");
					if ( yesNo == JOptionPane.NO_OPTION ) {
						JOptionPane.showMessageDialog(null, "로그인을 종료합니다.");
						return;
					}
				}
			}
			
			// 비밀번호 입력 (최대 5번)
			for (count = 1; count <= 5; count++) {
				sql = "update member set login = 'yes' where id = ? and pw = ?";
				ps = conn.prepareStatement(sql);
				pw = JOptionPane.showInputDialog("비밀번호 입력(" + count + "번째)");
				ps.setString(1, id);
				ps.setString(2, pw);
				result = ps.executeUpdate();
				
				if (result > 0) {
					JOptionPane.showMessageDialog(null, id + "님 로그인 성공!");
					break;
				} else if (count <= 5){
					JOptionPane.showMessageDialog(null, id + "님 비밀번호를 다시 입력하세요!");
				}
			}
			
			// 비밀번호 입력 횟수 초과 처리
			if ( count > 5 ) {
				JOptionPane.showMessageDialog(null, id + "님 비밀번호 입력 횟수 초과로 계정이 중지됩니다.");
				sql = "update member set locked = 'yes' where id = ?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, id);
				result = ps.executeUpdate();
				JOptionPane.showMessageDialog(null, result > 0 ? "계정 중지" : "실패!");
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
