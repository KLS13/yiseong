package com.koreait.ex;

public class Ex07_exception {

	public static void  div(int num1, int num2) throws ArithmeticException {
		System.out.println("¸ò : " + (num1 / num2));
		System.out.println("³ª¸ÓÁö : " + (num1 % num2));
	}
	public static void main(String[] args) throws ArithmeticException{
		
			div(5,2);
			div(5,0);
		
	}
}
