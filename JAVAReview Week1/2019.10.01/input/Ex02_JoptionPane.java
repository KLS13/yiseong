package com.koreait.ex;

import javax.swing.JOptionPane;

public class Ex02_JoptionPane {

	public static void main(String[] args) {
	/*
	 JOptionPane 클래스 ( 자바옵션패널 )
	   - 별도의 입력창을 통해 입력
	   - swing 컴포넌트 이용(javax.swing) 패키지 사용 import.
	   - JOptionPane 메소드
	         1) 입력
	         	String 변수 = JOptionPane.showInputDialog("입력메세지");
	         2) 출력
	         JOptionPane.showMessageDialog(null, "출력");
	 */
		
		// 성명 나이 신장  입력 --> 출력
	    //입력
		String name = JOptionPane.showInputDialog("성명을 입력하세요");
		String strAge = JOptionPane.showInputDialog("나이를 입력하세요");
		String strHeight = JOptionPane.showInputDialog("신장을 입력하세요");
		
		int age = Integer.parseInt(strAge);
		double height = Double.parseDouble(strHeight);

		// 출력
		JOptionPane.showMessageDialog(null, "성명 : " + name +
				", 나이 : " + age + ", 신장 : " + height);

	}

}
