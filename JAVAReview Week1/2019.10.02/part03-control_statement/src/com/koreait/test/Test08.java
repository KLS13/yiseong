package com.koreait.test;

import java.util.Scanner;

/*������ ����ϱ�
3���� : ����, ����, �б�
2���� : ����, �б�
1���� : �б�
���� ��)
���� �Է� >> 3
����, ����, �б�
*/

public class Test08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. �б� //  2. ����,�б� // 3. ����,����,�б�  >>");
		int num = input.nextInt();
		/*
		switch(num) {
		case 1 :
			System.out.println("�б�");
			break;
		case 2 :
			System.out.println("����, �б�");
			break;
		case 3 :
			System.out.println("����, ����, �б�");
			break;
		default :
			System.out.println("����");
			
		}
		*/
		
		switch(num) {
		case 3 : System.out.print("����, ");
		case 2 : System.out.print("����, ");
		case 1 : System.out.println("�б� ");
				break;
		default :
			System.out.println("����");
		}

	}

}
