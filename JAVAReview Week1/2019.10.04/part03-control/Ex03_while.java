package com.koreait.ex;

public class Ex03_while {

	public static void main(String[] args) {
		/*
		 1. ����
		 	while ( ���ǽ� ) {
		 		�ݺ����๮;
		 	}
		 	
		 2. Ư¡
		 	- ���ǽ��� �������� ������ �ѹ��� ������ �ȵ� �� �ֵ�.
		 	- �ݺ����๮�� ���� ��쿣 while (���ǽ�); �� ���� �������� ���
		 	- ���ѷ����� while(true) { } ����
		 */
		
		int num = 0;
		while(num < 10) {
		
			System.out.println(++num + "��°");
		}

	}

}
