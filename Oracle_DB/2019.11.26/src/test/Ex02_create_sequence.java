package test;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Ex02_create_sequence {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			// DB 연결
			conn = DBConnect.getConnection();
			
			// 시퀀스 생성
			String sql = "create sequence member_seq start with 1 increment by 1";
			ps = conn.prepareStatement(sql);
			ps.execute();
			System.out.println("member_seq 시퀀스 생성 성공!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if ( ps != null ) { ps.close(); }
				if ( conn != null ) { conn.close(); }
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
