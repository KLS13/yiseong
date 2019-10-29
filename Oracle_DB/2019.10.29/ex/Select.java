import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

import com.koreait.db.DBConnect;

public class Select {


	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "select no,id,email,point from member where grade = ?";
			ps = conn.prepareStatement(sql);
			
			String grade = JOptionPane.showInputDialog("검색할 등급은 ? ");
			ps.setString(1, grade);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.print(rs.getInt(1) + " \t");
				System.out.print(rs.getString(2) + " \t");
				System.out.print(rs.getString(3) + " \t");
				System.out.println(rs.getInt(4));
			}
			
			if(!rs.next()) {
				JOptionPane.showMessageDialog(null,"해당 등급 없음");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
					rs.close(); 
				}
				if(ps != null) {
					ps.close();
				}
				if(conn != null) {
					conn.close();
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
