package com.koreait.test;

public class Test01 {

	public static void main(String[] args) {
	
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			
			System.out.println("���� : " + (a+b));
			System.out.println("���� : " + (a-b));
			System.out.println("���� : " + (a*b));
			System.out.println("������ : " + (a/b));
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}catch(ArithmeticException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}catch(Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
		}
	}
}
