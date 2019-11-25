package com.koreait.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Ex05_update {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "update sample set name = ? where name = 'alice'";		
			ps = conn.prepareStatement(sql);
			ps.setString(1, "samanda");
			int result = ps.executeUpdate();
			System.out.println(result>0 ? "성공" : "실패");
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
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

