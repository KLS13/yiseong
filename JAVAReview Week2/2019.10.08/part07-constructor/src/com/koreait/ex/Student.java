package com.koreait.ex;

import java.util.Scanner;

public class Student {
	
	// Field
	String name;
	String dept;
	String score1;
	String score2;
	double average;
	boolean isPass;
	
	// Constructor
	Student(String _name, String _dept) {
		name = _name;
		dept = _dept;
	}
	
	// Method
	void input(Scanner scanner) {
		System.out.print("�߰� >> ");
		score1 = scanner.nextLine();
		System.out.print("�⸻ >> ");
		score2 = scanner.nextLine();
		average = (Double.parseDouble(score1) + Double.parseDouble(score2)) / 2;
		isPass = average >= 80 ? true : false;
	}
	void output() {
		System.out.println("�̸� : " + name);
		System.out.println("�а� : " + dept);
		System.out.println("��� : " + average);
		System.out.println("��� : " + (isPass ? "�հ�" : "���հ�"));
	}
	
}
