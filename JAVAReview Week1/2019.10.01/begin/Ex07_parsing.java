package com.koreait.ex;

public class Ex07_parsing {

	public static void main(String[] args) {
		//���ڿ� ��ȯ�� �� ��ȯ�� �ƴϰ�, ���� �м�
		
		// ���ڿ� --> ����  
		Integer.parseInt("10"); // --> 10
		
		// ���ڿ� --> �Ǽ�
		Double.parseDouble("3.14"); // -->  3.14
		// ����/�Ǽ� --> ���ڿ�
		String.valueOf(10);  // "10"
		String.valueOf(3.14); // "3.14"
		String strAge = "20";
		String strHeight = "180.5";
		
		int age = Integer.parseInt(strAge);
		double height = Double.parseDouble(strHeight);
		
		System.out.println(strAge);
		System.out.println(height);
		
		System.out.println("���̴� "+ strAge + "���̰�, Ű�� "+ height + "cm");
		
		if(String.valueOf(age)==strAge) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		// ���ڿ��� �񱳴� "=="�� �������� ����.

	}

}
