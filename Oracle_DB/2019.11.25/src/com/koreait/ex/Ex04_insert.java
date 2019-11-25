package com.koreait.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Ex04_insert {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			String sql = "insert into sample (no, name, reg_date) values (" +
			"sample_seq.nextval, ?, sysdate)";
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, "david");
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

