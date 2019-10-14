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
		System.out.println("성명 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + average);
		System.out.println("합격유무 : " + (isPass ? "합격" : "불합격"));
	}
	
}
