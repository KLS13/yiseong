//
package com.koreait.test;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ���� ȭ������ �Է� >> ");
		String str = input.next();
		System.out.print("�µ��� �Է� >> ");
		double num = input.nextDouble();
		
		switch(str) {
		case "����" :
			num = (num*1.8)+32;
			System.out.println(str + "����" + " ȭ��"+ num+ " �� ����Ǿ����ϴ�.");
			break;
		case "ȭ��" :
			num = (num-32)/1.8;
			System.out.println(str + "����" + " ����" + num+ " �� ����Ǿ����ϴ�.");
			break;
			default :
				System.out.println("����");
		}
	
	}

}
