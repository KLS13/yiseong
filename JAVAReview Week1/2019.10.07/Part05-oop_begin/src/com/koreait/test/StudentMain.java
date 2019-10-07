package com.koreait.test;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		/*
		 Student stu = new Student();
		 stu.input(new scanner(System.in);
		 */
		
		Scanner scanner = new Scanner(System.in);
		Student stu = new Student();
		
		stu.input(scanner);
		stu.output();

	}

}
