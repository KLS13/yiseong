package com.koreait.ex;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Student student = new Student("ȫ�浿", "��ǻ�Ͱ��а�");

		student.input(new Scanner(System.in));
		student.output();
		
	}

}
