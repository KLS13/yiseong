package com.koreait.test;
import java.util.Scanner;

class Student {
	String name;
	String dept;
	String score1;
	String score2;
	double average;
	boolean isPass;
	
		void input(Scanner scanner) {
			System.out.print("�̸� �Է� >>");
			name = scanner.nextLine();
			System.out.print("�й� �Է� >>");
			dept = scanner.nextLine();
			System.out.print("����1 �Է� >>");
			score1 = scanner.nextLine();
			System.out.print("����2 �Է� >>");
			score2 = scanner.nextLine();
			
			average = (Double.parseDouble(score1)+Double.parseDouble(score2)) / 2.0;
			if(average>=80) {
				isPass = true;
			}else {
				isPass = false;
			}
			
			}
		void output() {
			System.out.println("�̸� : "+ name+ "�й� : " + dept + "��� : " + average);
			System.out.println(isPass ? "�հ�" : "���հ�");
			
			
		}
}