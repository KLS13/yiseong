package com.koreait.ex;

public class Ex05_Variable {

	public static void main(String[] args) {
		// 변수선언 ( 선언과 초기화 동시에 진행 )
		int num1 = 0;
		float num2 = 0F;
		double num3 = 0;
		char ch = 0;
		String str1 = null;
		String str2 = "";
		
		num1 = 100;
		num2 = 1.5F;
		num3 = 1.5;
		ch = '한';
		str1 = "Hello";
		str2 = "Java";
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(ch);
		System.out.println(str1);
		System.out.println(str2);
		
		// 변수의 스코프 ( scope 범위 )
		// 지역변수 : 코드블록 (중괄호 { } ) 내 에서만 접근 가능, 벗어나면 소멸
		// 전역변수 : 모든 지역에서 사용할 수 있다.
		
		{
			int a = 10;
			System.out.println("코드 블록 내의 a = " + a);
		}
		//System.out.println("코드 블록 밖의 a = " + a); --> 불가
		//35 라인에서 이미 a변수가 소멸됨.

	}

}
