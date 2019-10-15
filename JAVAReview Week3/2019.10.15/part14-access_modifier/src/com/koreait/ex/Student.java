package com.koreait.ex;

import java.util.Scanner;

public class Student {
	
	// Field
	private String name;
	private String dept;
	private String score1;
	private String score2;
	private double average;
	private boolean isPass;
	
	// Constructor
	public Student(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	// Method
	public void input(Scanner scanner) {
		System.out.print("�߰� >> ");
		score1 = scanner.nextLine();
		System.out.print("�⸻ >> ");
		score2 = scanner.nextLine();
		average = getAverage();
		isPass = isPass();
	}
	private double getAverage() {
		return (Double.parseDouble(score1) + Double.parseDouble(score2)) / 2;
	}
	private boolean isPass() {
		return average >= 80 ? true : false;
	}
	public void output() {
		System.out.println("�̸� : " + name);
		System.out.println("�а� : " + dept);
		System.out.println("��� : " + average);
		System.out.println("��� : " + (isPass ? "�հ�" : "���հ�"));
	}
	
}
