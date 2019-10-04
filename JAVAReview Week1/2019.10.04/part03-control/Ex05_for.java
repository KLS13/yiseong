package com.koreait.ex;

public class Ex05_for {

	public static void main(String[] args) {
		/*
		 for(초기문; 조건문; 반복실행문 후 실행) {
		 	반복실행문;
		 }
		 
		 반복의 횟수 또는 범위가 명확한 경우에 사용.
		 주로 배열과 함께 사용
		 */
		int i;
		for(i=0 ; i<10; i++) {			
			System.out.println(i+1 + "번째");			
		}
		System.out.println(i);
	}
}
