package test;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Ex01_create_table {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			// DB 연결
			conn = DBConnect.getConnection();
			
			// 테이블 생성
			String sql = "create table member (" +
						"no number not null primary key, " + 
						"name varchar2(20) not null, " +
						"id varchar2(20) not null unique, " +
						"pw varchar2(20) not null, " +
						"join_date date not null, " +
						"login varchar2(5) check(login='yes' or login='no'), " +
						"locked varchar2(5) check(locked in('yes', 'no'))" +
						")";
			ps = conn.prepareStatement(sql);
			ps.execute();
			System.out.println("member 테이블 생성 성공!");
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
