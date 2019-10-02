package com.koreait.ex;

import javax.swing.JOptionPane;

public class Ex02_switch {

	public static void main(String[] args) {
		/*
		 형식
		 	switch( 표현식 ) {
		 	case 값 1 : 실행문;
		 		break;
		 	case 값 2 : 실행문;
		 		break;
		 	default : 실행문;
		 	}
		 	
		 특징
		 표현식의 결과는  정수,문자,문자열만 가능하다.
		   switch(var) {
		   case >= 10;  (X)
		   case 10  :   (O)
		   case 1.5 :   (X)
		   case '남':    (O)
		   case "admin" (O)
		   }
		 */
		int num = Integer.parseInt(JOptionPane.showInputDialog("나이를 입력하세요"));

		switch(num/10) {
		case 0:
		case 1: 
			JOptionPane.showMessageDialog(null, "미성년자");
			break;
		default:
			JOptionPane.showMessageDialog(null, "성인");
			break;
		}			
	}
}

