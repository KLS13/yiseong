package com.koreait.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JOptionPane;

import com.koreait.db.DBConnect;

public class Ex02_update {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;

		try {
			conn = DBConnect.getConnection();
			String sql = "update student set name = ?, addr = ? where no = ?";
			ps = conn.prepareStatement(sql);

			int no = Integer.parseInt(JOptionPane.showInputDialog("정보를 변경할 학생 번호 입력"));
			String name = JOptionPane.showInputDialog("변경할 이름 입력");
			String addr = JOptionPane.showInputDialog("변경할 주소 입력");
			ps.setString(1, name);
			ps.setString(2, addr);
			ps.setInt(3, no);

			int result = ps.executeUpdate();
			JOptionPane.showMessageDialog(null, result > 0 ? "변경성공" : "변경실패");
			conn.commit();
		} catch (Exception e) {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
