package com.koreait.ex;

public class Ex09_operator02 {

	public static void main(String[] args) {
		/*
		 ���� ������
		  a++ : a�� ����ϰ� ����
		  ++a : a�� �����ϰ� ���
		  a-- : a�� ����ϰ� ����
		  --a : a�� �����ϰ� ���
		  
		  ����Ʈ ������
		   ���� ����Ʈ
		   - <<
		   - �������� ���ڸ��� �о��.
		   - ��Ʈ ����
		   - 2�� ���ϴ� ȿ���� �ִ�.
		   ������ ����Ʈ
		   - >>
		   - ���������� �� �ڸ��� �о��.
		   - ��Ʈ ����
		   - 2�� ������ ȿ���� �ִ�.
		 */

		int num = 8;
		System.out.println("���� ����Ʈ : " + (num<<1));
		System.out.println("������ ����Ʈ : " + (num>>1));
	}

	

}
