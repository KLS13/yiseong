//���� ���� ���� ������ �Է¹޾� ��հ� ���� ���
package com.koreait.ex;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		System.out.print("�������� �Է�  >> ");
		int kor = input.nextInt();
		System.out.print("�������� �Է�  >> ");
		int mat = input.nextInt();
		System.out.print("�������� �Է�  >> ");
		int eng = input.nextInt();
		
		double avg = (kor+mat+eng)/3.0;
		
		String grade = avg>90 ? "A����" : avg > 80 ? "B����" : avg >70 ? "C����" : avg > 60? "D����" : "F����";
		
		System.out.println("��������� " + avg + ", ������ " + grade);
		

	}

}
