package com.koreait.ex;

public class Ex03_Sysout {

	public static void main(String[] args) {
		
		// 1. 줄바꿈이 필요할때는 
		System.out.println();
		// 2. 산술연산자
		System.out.println(1+1);
		System.out.println(1.5+1);
		// 3. 연결연산자
		System.out.println("Hello"+"Java");
		// 4. 숫자와 문자열 : 연결연산자
		System.out.println(100 + "원");
		System.out.println(100+100+"원");
		System.out.println("$"+100);
		System.out.println("$"+(100+100));
		System.out.println("$"+100+100);
		/* 5. 이스케이프 문자
			- 줄바꿈 : \n
			- 간격    : \t
			- '출력  : \'
			- "출력  : \"
		 */
	}

}
