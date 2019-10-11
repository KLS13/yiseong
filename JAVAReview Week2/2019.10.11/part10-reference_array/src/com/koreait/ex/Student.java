package com.koreait.ex;

public class Student {
	String name;
	String dept;
	String scores1;
	String scores2;
	double average;
	boolean isPass;
	
	Student() { }
	
	Student(String name, String dept, String scores1, String scores2) {
		this.name = name;
		this.dept = dept;
		this.scores1 = scores1;
		this.scores2 = scores2;
		this.average = getAverage();
		this.isPass = getPass();
	}
	double getAverage() {
		double a = Double.parseDouble(scores1);
		double b = Double.parseDouble(scores2);
		return(a+b) / 2;
	}
	
	boolean getPass() {
		return getAverage() >= 80 ? true : false;
	}
	
	void output() {
		System.out.println("���� : " + name);
		System.out.println("�а� : " + dept);
		System.out.println("��� : " + average);
		System.out.println("�հ� : " + (isPass ? "�հ���" : "���հ���"));
	}
}
