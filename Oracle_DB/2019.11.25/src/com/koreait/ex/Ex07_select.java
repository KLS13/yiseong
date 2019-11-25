package com.koreait.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Ex07_select {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "select * from sample";		
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			while( rs.next()) {
				// rs == no + name + reg_date;
				// rs.getInt(1) == rs.getInt("no");
				// rs.getString(2) == rs.getString("name");
				// rs.getDate(3) == rs.getDate("reg_date");
				System.out.println(rs.getInt(1) + ", " + rs.getString(2) + ", " + rs.getDate(3));
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if( rs != null ) {
					rs.close();
				}
				if( ps != null ) {
					ps.close();
				}
				if ( conn != null ) {
					conn.close();
				} 
			}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

