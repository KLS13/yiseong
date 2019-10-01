package com.koreait.ex;

public class Ex06_casting {

	public static void main(String[] args) {
		/*
		 형 변환
		 타입이 섞인 경우 작은 크기의 타입을 큰 크기의 타입으로 통일시키는 방향으로 형 변환
		 short int 의 연산 -- > 둘다 int로 변환 후 연산
		 정수와 실수가 섞인 경우 정수를 실수로 변환
		 
		 강제 형 변환 ( 명시적 )
		 1) 개발자가 직접 형 변환
		 2)타입 상관없이 원하는 타입으로 변환
		 3)(자료형) 변수, (자료형) 값
		  예) int num = 10;
		    (double)num  실수로 처리
		 */
		// 자동 형 변환
		System.out.println(1+1.5);
		//java 스스로 system.out.println(1.0+1.5); 변환 후 처리
		double a = 10; // java 스스로 double a = 10.0 으로 변환
		
		// 2. 강제형변환
		int b = (int)20.9;
		int c = 1;
		int d = 2;
		double e = (double)c/d;
		System.out.println(e);
	}

}
