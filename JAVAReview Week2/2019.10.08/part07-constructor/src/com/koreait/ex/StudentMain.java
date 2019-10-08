package com.koreait.ex;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Student student = new Student("홍길동", "컴퓨터공학과");

		student.input(new Scanner(System.in));
		student.output();
		
	}

}
