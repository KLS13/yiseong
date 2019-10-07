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
		System.out.print("가로 입력 >>");
		width = scanner.nextInt();
		System.out.print("높이 입력 >>");
		height = scanner.nextInt();
	}
	
	void calcArea() {
		System.out.println("넓이 : " + width * height);
	}
	void info() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		calcArea();
	}
	
}
