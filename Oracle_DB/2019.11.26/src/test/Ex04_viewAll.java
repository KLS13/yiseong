package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex04_viewAll {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			/* substr(id,1,2) : id의 1~2번째 글자만 사용
			   length(id) : id의 글자수
			   rpad('문자열', n, '문자') : '문자열' 오른쪽에 '문자'를 채워라! 총 글자 수가 n이 되게 하라!
			   sql = "select no, name, rpad(substr(id,1,2), length(id), '*'), join_date, locked from member";
			 */
			String sql = "";
			sql = "select no, name, id, join_date, locked from member";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next()) {
				System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3).substring(0,2)+
						rs.getString(3).replaceAll(".", "*").substring(2) +
						", " + rs.getDate(4) + ", " + rs.getString(5));
			}
			/*
			while( rs.next()) {
			System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getString(3) +
					"," + rs.getDate(4) + ", 중지계정 여부 : " + rs.getString(5));
			}
			*/
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
