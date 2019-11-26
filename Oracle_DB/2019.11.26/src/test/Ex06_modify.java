package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

public class Ex06_modify {

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
			String name = "";
			int result = 0;
			
			// 회원정보 입력
			id = JOptionPane.showInputDialog("아이디 입력!");
			pw = JOptionPane.showInputDialog("비밀번호 입력!");

			// 회원정보 확인
			sql = "select * from member where id = ? and pw = ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pw);
			rs = ps.executeQuery();
			
			// 회원이 있으면!
			if ( rs.next() ) {
				JOptionPane.showMessageDialog(null, "변경할 항목을 선택하세요!");
				switch ( JOptionPane.showInputDialog("1: 성명 변경\n2: 비밀번호 변경") ) {
				case "1":
					sql = "update member set name = ? where id = ?";
					ps = conn.prepareStatement(sql);
					name = JOptionPane.showInputDialog("변경할 성명을 입력하세요!");
					ps.setString(1, name);
					ps.setString(2, id);
					result = ps.executeUpdate();
					JOptionPane.showMessageDialog(null, result > 0 ? "성명 변경 성공!" : "실패!");
					break;
				case "2":
					sql = "update member set pw = ? where id = ?";
					ps = conn.prepareStatement(sql);
					pw = JOptionPane.showInputDialog("변경할 비밀번호를 입력하세요!");
					ps.setString(1, pw);
					ps.setString(2, id);
					result = ps.executeUpdate();
					JOptionPane.showMessageDialog(null, result > 0 ? "비밀번호 변경 성공!" : "실패!");
					break;
				default:
					JOptionPane.showMessageDialog(null, "없는 명령입니다!");
				}
			}
			// 회원이 없으면!
			else {
				JOptionPane.showMessageDialog(null, "일치하는 회원 정보가 없습니다.");
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
