package com.koreait.ex;

import javax.swing.JOptionPane;

public class Ex06_break {

	public static void main(String[] args) {
		/*
		 	형식
		 	
		 	while(true) {
		 	if(조건식) {
		 	break;
		 	}
		 }
		 
		 	특징
		 	반복문을 곧바로 종료
		 	switch 곧바로 종료
		 */
		
		String id;
		while(true) {
			id = JOptionPane.showInputDialog(" ID 입력 >> ");
			if(id.equals("admin")){
					JOptionPane.showMessageDialog(null, "아이디 일치");
					break;
		}else {
			JOptionPane.showMessageDialog(null, "다시 입력하세요");
			}
		}

	}

}
