package com.koreait.test;

import java.util.Scanner;

public class Rect {

	// Field
	Scanner scanner;
	int width;
	int height;
	
	// Method
	void init() {
		scanner = new Scanner(System.in);
		System.out.print("���� �Է� >>");
		width = scanner.nextInt();
		System.out.print("���� �Է� >>");
		height = scanner.nextInt();
	}
	
	void calcArea() {
		System.out.println("���� : " + width * height);
	}
	void info() {
		System.out.println("�ʺ� : " + width);
		System.out.println("���� : " + height);
		calcArea();
	}
	
}
