package com.koreait.ex;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
		/*
		 Random Ŭ����
		 1. ��ü(�ν��Ͻ�) ������ �Ѵ�.
		 2. ��ü(�ν��Ͻ�)�� �޼ҵ� ȣ��� ������ �߻���Ŵ.
		 	nextInt() : int�� ������ ���� ���� ���� �߻�
		 	nextDouble() : 0~0.999999 ( 0 �̻� 1�̸� ) ������ ���� �߻�
		 	
		 */
		
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(45));
		System.out.println(random.nextInt(6)+1);
		System.out.println(random.nextDouble());
		System.out.println(random.nextDouble()*10);
		System.out.println((int)(random.nextDouble()*10));
		// 1~6 ���� �߻�
		System.out.println((int)(random.nextDouble()*6)+1);

	}

}
