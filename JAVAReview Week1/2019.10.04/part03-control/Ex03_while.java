package com.koreait.ex;

public class Ex03_while {

	public static void main(String[] args) {
		/*
		 1. 형식
		 	while ( 조건식 ) {
		 		반복실행문;
		 	}
		 	
		 2. 특징
		 	- 조건식을 만족하지 않으면 한번도 실행이 안될 수 있따.
		 	- 반복실행문이 없는 경우엔 while (조건식); 과 같은 형식으로 사용
		 	- 무한루프는 while(true) { } 형식
		 */
		
		int num = 0;
		while(num < 10) {
		
			System.out.println(++num + "번째");
		}

	}

}
