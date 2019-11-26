package test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Ex03_join {

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
			String pw1 = "";
			String pw2 = "";
			String name = "";
			int result = 0;
			
			JOptionPane.showMessageDialog(null, "회원가입입니다.\n신규회원정보를 입력하세요");
			
			// 아이디 입력
			while (true) {
				// 신규 아이디 입력
				id = JOptionPane.showInputDialog("신규 아이디 입력");
				// 신규 아이디와 기존 아이디를 비교
				sql = "select * from member where id = ?";
				ps = conn.prepareStatement(sql);
				ps.setString(1, id);
				rs = ps.executeQuery();
				// rs(결과집합)가 있다는 것은 이미 존재하는 아이디라는 의미
				if ( rs.next() ) {
					JOptionPane.showMessageDialog(null, id + "는 사용중입니다. 다른 아이디를 입력하세요.");
				} else {
					int yesNo = JOptionPane.showConfirmDialog(null, id + "는 사용 가능한 아이디입니다.\n사용하시겠습니까?");
					if ( yesNo == JOptionPane.YES_OPTION ) {
						break;
					}
				}
			}
			
			// 비밀번호, 성명 입력
			name = JOptionPane.showInputDialog("성명 입력");
			while (true) {
				pw1 = JOptionPane.showInputDialog("비밀번호 입력");
				pw2 = JOptionPane.showInputDialog("비밀번호 확인");
				if (pw1.equals(pw2)) {
					break;
				} else {
					JOptionPane.showMessageDialog(null, "비밀번호를 다시 확인하세요!");
				}
			}
			
			// 입력 받은 정보(id, pw1, name)를 DB에 저장
			sql = "insert into member values (member_seq.nextval, ?, ?, ?, sysdate, 'no', 'no')";
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, id);
			ps.setString(3, pw1);
			result = ps.executeUpdate();
			JOptionPane.showMessageDialog(null, result > 0 ? "회원가입 성공!" : "회원가입 실패!");
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
