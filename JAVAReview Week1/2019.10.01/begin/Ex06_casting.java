package com.koreait.ex;

public class Ex06_casting {

	public static void main(String[] args) {
		/*
		 �� ��ȯ
		 Ÿ���� ���� ��� ���� ũ���� Ÿ���� ū ũ���� Ÿ������ ���Ͻ�Ű�� �������� �� ��ȯ
		 short int �� ���� -- > �Ѵ� int�� ��ȯ �� ����
		 ������ �Ǽ��� ���� ��� ������ �Ǽ��� ��ȯ
		 
		 ���� �� ��ȯ ( ����� )
		 1) �����ڰ� ���� �� ��ȯ
		 2)Ÿ�� ������� ���ϴ� Ÿ������ ��ȯ
		 3)(�ڷ���) ����, (�ڷ���) ��
		  ��) int num = 10;
		    (double)num  �Ǽ��� ó��
		 */
		// �ڵ� �� ��ȯ
		System.out.println(1+1.5);
		//java ������ system.out.println(1.0+1.5); ��ȯ �� ó��
		double a = 10; // java ������ double a = 10.0 ���� ��ȯ
		
		// 2. ��������ȯ
		int b = (int)20.9;
		int c = 1;
		int d = 2;
		double e = (double)c/d;
		System.out.println(e);
	}

}
