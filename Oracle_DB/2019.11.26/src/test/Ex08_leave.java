package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Ex08_leave {

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
			String pw = "";
			int yesNo = 0;
			int result = 0;
			
			JOptionPane.showMessageDialog(null, "회원탈퇴를 진행합니다.");

			// 아이디 입력
			id = JOptionPane.showInputDialog("탈퇴할 아이디를 입력하세요.");
			
			// 아이디 검사
			sql = "select * from member where id = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			
			// 아이디가 있으면!
			if ( rs.next() ) {
				// 비밀번호 입력
				pw = JOptionPane.showInputDialog("비밀번호를 입력하세요.");
				// 탈퇴 확인
				yesNo = JOptionPane.showConfirmDialog(null, "정말 탈퇴하시겠습니까?");
				if ( yesNo == JOptionPane.YES_OPTION ) {
					sql = "delete from member where id = ? and pw = ?";
					ps = conn.prepareStatement(sql);
					ps.setString(1, id);
					ps.setString(2, pw);
					result = ps.executeUpdate();
					JOptionPane.showMessageDialog(null, result > 0 ? "탈퇴되었습니다!" : "실패!");
				} else {
					JOptionPane.showMessageDialog(null, "회원탈퇴를 취소합니다.");
				}
			}
			// 아이디가 없으면!
			else {
				JOptionPane.showMessageDialog(null, id + "님의 회원 정보가 확인되지 않습니다.");
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
