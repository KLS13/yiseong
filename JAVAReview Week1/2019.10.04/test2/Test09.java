package com.koreait.test2;

import java.util.Scanner;

import javax.swing.JOptionPane;

//로그인 시뮬레이션
// 아이디 : admim  비밀번호 : 1234; 로그인
// 아디입력 성공시 비밀번호 입력
// 아이디 입력실패 --> 아이디 다시입력
// 비밀번호 입력 성공 --> 로그인 성공
// 비밀번호 실패 --> 다시 비밀번호 입력 ( 횟수 제한 5회 ) --> 5회 초과시 비밀번호 입력 횟수 초과 메시지 "출력"
public class Test09 {

	public static void main(String[] args) {
	
		
		String id;
		String pw;
		final int MAX_COUNT = 5;
		int count=0;

		do {
			id = JOptionPane.showInputDialog("ID 입력 >> ");
		} while(!id.equals("admin"));
		
		//비밀번호 처리
		do {
			count++;
			if( count > MAX_COUNT) {
				JOptionPane.showMessageDialog(null, "비밀번호 입력횟수 초과");
				//return;  main 메소드의 종료
				System.exit(0); // 시스템 강제종료  or  return --> 두 가지 중에 하나.
			}
			pw = JOptionPane.showInputDialog("PW 입력(최대 5회) >> ");
		}while(!pw.equals("1234"));
		
		//로그인 성공
		JOptionPane.showMessageDialog(null, "로그인 성공!");
	}
}
