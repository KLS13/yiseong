package com.koreait.ex;

public class Ex05_Variable {

	public static void main(String[] args) {
		// �������� ( ����� �ʱ�ȭ ���ÿ� ���� )
		int num1 = 0;
		float num2 = 0F;
		double num3 = 0;
		char ch = 0;
		String str1 = null;
		String str2 = "";
		
		num1 = 100;
		num2 = 1.5F;
		num3 = 1.5;
		ch = '��';
		str1 = "Hello";
		str2 = "Java";
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(ch);
		System.out.println(str1);
		System.out.println(str2);
		
		// ������ ������ ( scope ���� )
		// �������� : �ڵ��� (�߰�ȣ { } ) �� ������ ���� ����, ����� �Ҹ�
		// �������� : ��� �������� ����� �� �ִ�.
		
		{
			int a = 10;
			System.out.println("�ڵ� ��� ���� a = " + a);
		}
		//System.out.println("�ڵ� ��� ���� a = " + a); --> �Ұ�
		//35 ���ο��� �̹� a������ �Ҹ��.

	}

}
