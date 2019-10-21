package com.koreait.test;

import java.util.Scanner;

public class Test05_1 {
	
	// Field
	static Scanner scanner = new Scanner(System.in);

	// Method
	static String inputName() {
		
		StringBuffer sb = new StringBuffer();
		
		System.out.print("�̸�(lastName) >> ");
		String lastName = scanner.nextLine();
		System.out.print("��(firstName) >> ");
		String firstName = scanner.nextLine();
		
		sb.append(lastName).append(" ").append(firstName);
		
		return sb.toString();  // StringBuffer --> String
		
	}

	public static void main(String[] args) {

		// �ٸ� �޼ҵ� ȣ���Ϸ���
		// �ٸ� �޼ҵ�� ��� static ó���� �ؾ� ȣ���� �����ϴ�.
		// static �޼ҵ�� static �޼ҵ常 ȣ���� �� �����Ƿ�!
		
		String fullName1 = inputName();
		String fullName2 = inputName();
		
		System.out.println("����1 : " + fullName1);
		System.out.println("����2 : " + fullName2);
		
		System.out.println(fullName1.equals(fullName2) ? "���� �̸�" : "�ٸ� �̸�");
		
		scanner.close();
		
	}

}













