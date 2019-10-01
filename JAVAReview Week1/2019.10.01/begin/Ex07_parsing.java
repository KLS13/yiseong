package com.koreait.ex;

public class Ex07_parsing {

	public static void main(String[] args) {
		//문자열 변환은 형 변환이 아니고, 구문 분석
		
		// 문자열 --> 정수  
		Integer.parseInt("10"); // --> 10
		
		// 문자열 --> 실수
		Double.parseDouble("3.14"); // -->  3.14
		// 정수/실수 --> 문자열
		String.valueOf(10);  // "10"
		String.valueOf(3.14); // "3.14"
		String strAge = "20";
		String strHeight = "180.5";
		
		int age = Integer.parseInt(strAge);
		double height = Double.parseDouble(strHeight);
		
		System.out.println(strAge);
		System.out.println(height);
		
		System.out.println("나이는 "+ strAge + "살이고, 키는 "+ height + "cm");
		
		if(String.valueOf(age)==strAge) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		// 문자열의 비교는 "=="로 진행하지 않음.

	}

}
