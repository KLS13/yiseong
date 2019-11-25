package com.koreait.test;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Ex01_create {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		
		try{
			conn = DBConnect.getConnection();
			String sql = "create table member(no number not null primary key," + 
			"name varchar2(20) not null, id varchar2(20) not null unique,"+
			"pw varchar2(20) not null, join_date date, login varchar2(5) check(login in('yes','no'))," +
			"locked varchar2(5) check(locked in('yes','no')))";
			ps = conn.prepareStatement(sql);
			ps.execute();
			System.out.println("테이블 생성 성공 ! ");
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
