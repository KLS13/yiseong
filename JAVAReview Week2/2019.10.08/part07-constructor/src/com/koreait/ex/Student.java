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
		System.out.print("중간 >> ");
		score1 = scanner.nextLine();
		System.out.print("기말 >> ");
		score2 = scanner.nextLine();
		average = (Double.parseDouble(score1) + Double.parseDouble(score2)) / 2;
		isPass = average >= 80 ? true : false;
	}
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + average);
		System.out.println("결과 : " + (isPass ? "합격" : "불합격"));
	}
	
}
