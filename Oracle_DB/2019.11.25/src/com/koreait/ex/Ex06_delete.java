package com.koreait.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Ex06_delete {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "delete from sample where no = ?";		
			ps = conn.prepareStatement(sql);
			ps.setInt(1, 1);
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

