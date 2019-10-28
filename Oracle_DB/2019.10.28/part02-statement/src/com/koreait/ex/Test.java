package com.koreait.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.koreait.db.DBConnect;

public class Test {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "select * from student order by no desc";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			
	
			
			while(rs.next()) {
				System.out.print(rs.getInt(1) + " \t");
				System.out.print(rs.getString(2) + " \t");
				System.out.println(rs.getString(3));
			}
			}catch(Exception e) {
				
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
			}
		}

	}

}
