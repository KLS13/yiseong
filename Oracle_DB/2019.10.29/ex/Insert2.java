import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import com.koreait.db.DBConnect;

public class Insert2 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "insert into member values (member_seq.nextval, ?, ?, ?, ?, ?, ?)";
			// 입력
			String id = JOptionPane.showInputDialog("아이디");
			String pw = JOptionPane.showInputDialog("비밀번호");
			String email = JOptionPane.showInputDialog("이메일");
			
			int point = 0;
			do {
				point = Integer.parseInt(JOptionPane.showInputDialog("포인트"));
				if (point > 10000) {
					point = 10000;
				}
			} while (point < 0);
			
			String grade = "";
			do {
				grade = JOptionPane.showInputDialog("등급(vip, gold)");
			} while (!grade.equals("vip") && !grade.equals("gold"));
			
			String date = JOptionPane.showInputDialog("가입일");

			// sql 에 전달
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, id);
			ps.setString(2, pw);
			ps.setString(3, email);
			ps.setInt(4, point);
			ps.setString(5, grade);
			ps.setString(6, date);
			
			int result = ps.executeUpdate();
			System.out.println(result > 0 ? "insert 성공" : "insert 실패");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) ps.close();
				if (conn != null) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
