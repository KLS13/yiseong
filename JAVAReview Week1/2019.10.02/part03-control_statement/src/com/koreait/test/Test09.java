/*
���� �Է� �޾� ���� ����ϱ�
���� ��)
�� �Է� >> 10
10���� 31�ϱ��� �ֽ��ϴ�.
 */
package com.koreait.test;
import java.util.Scanner;
public class Test09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���ϴ� ���� �Է����ּ��� >> ");
		int month = input.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: 
		case 7: case 8: case 10:
		case 12:
			System.out.println(month + "������ 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 4: case 6:
		case 9: case 11:
			System.out.println(month + "������ 30�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println(month + "������ 28�ϱ��� ������, 4�⸶�� �������� 29���Դϴ�.");
			break;
		default :
			System.out.println("����");
		}

	}

}
