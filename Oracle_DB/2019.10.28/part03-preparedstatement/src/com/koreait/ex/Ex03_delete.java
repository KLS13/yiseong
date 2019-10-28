package com.koreait.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import com.koreait.db.DBConnect;

public class Ex03_delete {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnect.getConnection();
			
			String sql = "delete from student where no = ?";
			ps = conn.prepareStatement(sql);
			int no = Integer.parseInt(JOptionPane.showInputDialog("삭제할 번호는 " ));
			ps.setInt(1, no);
			int result = ps.executeUpdate();
			System.out.println(result > 0 ? "성공" : "실패");
			conn.commit();
		}catch (Exception e) {
			try {
				if(conn != null) {
					conn.rollback();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}finally {
			try {
				if(ps != null) {
					ps.close();
				}if (conn != null) {
				conn.close();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		}

	}

}