package com.koreait.ex;

public class Ex06_exception {

	public static void  div(int num1, int num2) throws ArithmeticException {
		System.out.println("�� : " + (num1 / num2));
		System.out.println("������ : " + (num1 % num2));
	}
	public static void main(String[] args) {
		try {
			div(5,2);
			div(5,0);
		}catch(ArithmeticException e) {
			System.out.println("0 ���δ� ������");
			e.printStackTrace();
		}

	}

}
