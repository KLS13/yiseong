package com.koreait.ex;

public class Ex02_Random {

	public static void main(String[] args) {

		/*
		 * Math Ŭ����
		 * ��ü(�ν��Ͻ�) ������ ����.
		 * Math.random() �޼ҵ带 �̿�
		 * �������� ���� : 0~0.999999
		 * ���ϴ� ���� ���� ����
		 * 	(int)(Math.random() * n) + a : a���� n���� �����߻�
		 */

		System.out.println((int)(Math.random()*6)+1);
		//Ȯ��ó�� 0% ~ 99.999999%
		
		System.out.println(Math.random() <= 0.05 ? "���" : "��");
	}

}
