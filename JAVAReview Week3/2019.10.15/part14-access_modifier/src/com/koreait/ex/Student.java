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
		System.out.print("중간 >> ");
		score1 = scanner.nextLine();
		System.out.print("기말 >> ");
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
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + average);
		System.out.println("결과 : " + (isPass ? "합격" : "불합격"));
	}
	
}
