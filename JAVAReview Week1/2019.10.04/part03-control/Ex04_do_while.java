package com.koreait.ex;

public class Ex04_do_while {

	public static void main(String[] args) {
		/*
		 do {
		 	반복실행문;
		 } while(조건식);
		 
		 반드시 한번은 실행되는 반복문이다
		 나머지 특징은 while문
		 */
		
		int num = 0;
		
		do {
			num ++;
			System.out.println(num+"번째");
		}while(num<10);

	}

}
