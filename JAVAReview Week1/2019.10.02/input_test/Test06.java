package com.koreait.ex;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ֹι�ȣ �Է� >> ");
		char num = input.next().charAt(6);
		
		String gender = (num == '1' || num == '3' ) ? "����" : "����";
		
		System.out.println("������ " + gender + " �Դϴ�.");

		input.close();
		
	}

}
