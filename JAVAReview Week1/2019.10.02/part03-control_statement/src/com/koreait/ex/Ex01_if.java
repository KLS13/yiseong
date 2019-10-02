package com.koreait.ex;

import javax.swing.JOptionPane;

public class Ex01_if {

	public static void main(String[] args) {
		/*
		 if(조건식) {
		 	실행문;
		 	}else if (조건식){
		 	실행문;
		 	}else {
		 	실행문;
		 	}
		 	
		 특징
		  1) else if문은 없어도 되고, 여러 개가 있을 수 있다.
		  2) else 문은 없어도 되고, 한 개가 있을 수 있다.
		  3) 실행문이 하나라면 실행 블록의 중괄호( {} )는 생략할 수 있다.
		  
		 */
		int num = Integer.parseInt(JOptionPane.showInputDialog("정수를 입력하세요 >> "));
		
		if(num > 0) {
			JOptionPane.showMessageDialog(null, "양수");
		}else if (num==0) {
			JOptionPane.showMessageDialog(null, "ZERO");
		}else {
			JOptionPane.showMessageDialog(null, "음수");
		}
	}

}
