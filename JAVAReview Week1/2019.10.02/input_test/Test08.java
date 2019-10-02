package com.koreait.ex;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("몸무게를 입력하세요 >> ");
		double kg = input.nextDouble();
		System.out.print("키를 입력하세요 >> ");
		double height = input.nextDouble();
		height /= 100;
		System.out.println(height);
		double bmi = (kg/height/height);
		
		String bmiResult = bmi >= 25 ? "과체중" : bmi >= 20 ? "정상" : "저체중";
		
		//25이상 과체중  20이상 정상 미만 저제중
		
		System.out.println("결과는 " + bmiResult + " 입니다.");

	}

}
