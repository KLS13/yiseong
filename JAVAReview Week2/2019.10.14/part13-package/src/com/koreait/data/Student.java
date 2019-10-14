package com.koreait.data;

public class Student {

	// Field
	public String name;
	public String dept;
	public String score1;
	public String score2;
	public double average;
	public boolean isPass;
	
	// Constructor
	public Student() { }
	public Student(String name, String dept, String score1, String score2) {
		this.name = name;
		this.dept = dept;
		this.score1 = score1;
		this.score2 = score2;
		this.average = getAverage();
		this.isPass = getPass();
	}
	
	// Method
	public double getAverage() {
		double a = Double.parseDouble(score1);
		double b = Double.parseDouble(score2);
		return (a + b) / 2;
	}
	public boolean getPass() {
		return getAverage() >= 80 ? true : false;
	}
	public void output() {
		System.out.println("���� : " + name);
		System.out.println("�а� : " + dept);
		System.out.println("��� : " + average);
		System.out.println("�հ����� : " + (isPass ? "�հ�" : "���հ�"));
	}
	
}
