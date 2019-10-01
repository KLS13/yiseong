package com.koreait.ex;
import java.util.*;
public class Ex01_scanner {

	public static void main(String[] args) {
		/*
		 * 1. Scanner Ŭ����
		 * 
		 * 	1) �ܼ� â�� ���� �Է�
		 * 	2) java.util.Scanner Ŭ������ ����
		 * 		1) java.util.Scanner �� �״�� ���
		 * 		2) import �� ���
		 * 			- import ��� : java.lang �̿��� ��� Ŭ����
		 * 	3) Scanner Ŭ������ ��ü ���� ���
		 * 		Scanner ��ü�� = new Scanner(�Է½�Ʈ��);
		 * 	4) Scanner Ŭ������ ��ü �Ҹ� ���
		 * 		��ü��.close();
		 * 	5) Scanner Ŭ������ �޼ҵ�
		 * 		(1) ���ڿ� �Է�
		 * 			- next() : ���� ������ �Է�
		 * 			- nextLine() : ���� ������ �Է�
		 * 		(2) ���� �Է�
		 * 			- nextInt(), nextByte(), nextShort(), nextLong()
		 * 		(3) �Ǽ� �Է�
		 * 			- nextDouble(), nextFloat()
		 * 		(4) �� �Է�
		 * 			- nextBoolean()
		 * 		(5) ���� �Է�
		 * 			- ���ڿ� �Է�(next(), nextLine()) ���� �� ù ��° ��(charAt(0))�� ���
		 */
		
		// ����, ����, Ű, ���� �Է� �޾� ����ϱ�
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("���� �Է� >> ");
		String name = scanner.nextLine();
		System.out.print("���� �Է� >> ");
		int age = scanner.nextInt();
		System.out.print("���� �Է� >> ");
		double height = scanner.nextDouble();
		System.out.print("���� �Է� >> ");
		char gender = scanner.next().charAt(0);
		
		System.out.println("�̸� : " + name + ", ���� : " + age + ", ���� : " + height + ", ���� : " + gender);
		
		// scanner ��ü �Ҹ�
		scanner.close();
		
		}

}
