package com.koreait.ex;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� ���� ȭ������ �Է� >> ");
		String str = input.next();
		System.out.print("�µ��� �Է� >> ");
		double num = input.nextDouble();
		
		double temper = (str.equals("����")) ? (num*1.8)+32 : (num-32)/1.8;
		String result = (str.equals("����")) ? "ȭ��" : "����";
		System.out.println(str + "���� " + result + "�� ����Ǿ����ϴ� >> " + temper);

	}

}
