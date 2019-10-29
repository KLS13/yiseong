import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import com.koreait.db.DBConnect;

public class Delete {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "delete from member where id = ?";
			String id = JOptionPane.showInputDialog("삭제할 아이디는 ? : ");
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			int result = ps.executeUpdate();
			System.out.println(result > 0 ? id+"삭제성공" : "입력하신 " + id + " 는 없는 아이디입니다.");
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