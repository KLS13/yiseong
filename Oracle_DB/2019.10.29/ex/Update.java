import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import com.koreait.db.DBConnect;

public class Update {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "update member set pw = ? where id = ?";
			ps = conn.prepareStatement(sql);
			String id = JOptionPane.showInputDialog("해당 아이디는 ? : ");
			String pw = JOptionPane.showInputDialog("변경할 비밀번호는 ? : ");
			ps.setString(1, pw);
			ps.setString(2, id);
			int result = ps.executeUpdate();
			System.out.println(result > 0 ? "비밀번호 변경성공" : "입력하신 " + id + " 는 없는 아이디입니다.");
			conn.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps != null) ps.close();
				if(conn != null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
