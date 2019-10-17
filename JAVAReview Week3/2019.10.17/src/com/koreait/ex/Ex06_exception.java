package com.koreait.ex;

public class Ex06_exception {

	public static void  div(int num1, int num2) throws ArithmeticException {
		System.out.println("몫 : " + (num1 / num2));
		System.out.println("나머지 : " + (num1 % num2));
	}
	public static void main(String[] args) {
		try {
			div(5,2);
			div(5,0);
		}catch(ArithmeticException e) {
			System.out.println("0 으로는 못나눔");
			e.printStackTrace();
		}

	}

}
