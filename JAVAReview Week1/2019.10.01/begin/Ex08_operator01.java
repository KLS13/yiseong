package com.koreait.ex;

public class Ex08_operator01 {

	public static void main(String[] args) {
		/*
		 ���� ������
		 = : ����
		 +=: ���ؼ� ����
		 -=: ���� ����
		 *=: ���ؼ� ����
		 /=: ������ ����, ������ ����
		 %=: �������� ���ؼ� ����
		 */
		
		int num1 = 81;
		int front=num1/10;
		int end=num1%10;
		
		System.out.println("front : " + front + ", " + "end : " + end);
		
		int num2 = 3025;
		int front2 = num2/100;
		int end2 = num2%100;
		
		System.out.println("front : " + front2 + ", " + "end : " + end2);
		
		

	}

}
