package com.koreait.ex;

import java.util.Scanner;

public class Ex01_exception {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1, num2 ;
		try {
		System.out.print("����1 �Է� >> ");
		num1 = scanner.nextInt();
		System.out.print("����2 �Է� >> ");
		num2 = scanner.nextInt();

		System.out.println("���� : " + (num1+num2));
		System.out.println("���� : " + (num1-num2));
		System.out.println("���� : " + (num1*num2));
		System.out.println("������ : " + (num1/num2));
		}catch(Exception e) {
			System.out.println("0 ���� ���� �� �����ϴ�.");
		}finally {
			if( scanner != null) { scanner.close(); }
		}
	}

	
}
