package com.koreait.ex;

import javax.swing.JOptionPane;

public class Test10 {

	public static void main(String[] args) {
		
		String strKg = JOptionPane.showInputDialog("몸무게를 입력하세요");
		String strheight = JOptionPane.showInputDialog("키를 입력하세요");
		
		double kg = Double.parseDouble(strKg);
		double height = Double.parseDouble(strheight);
		height = height/100;
		double bmi = (kg/height/height);
		
		String bmiResult = bmi >= 25 ? "과체중" : bmi >= 20 ? "정상" : "저체중";
		System.out.println("결과는 " + bmiResult + " 입니다.");

	}

}