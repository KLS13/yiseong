package com.koreait.test;

public class Circle {

	// Field
	double radius;
	final double PI = 3.141592;		// 좋은 구성은 아님
	String name;
	
	// Method
	void info() {
		System.out.println("반지름 : " + radius);
		System.out.println("이름 : " + name);
		System.out.println("크기 : " + radius * radius * PI);
		System.out.println("둘레 : " + 2 * PI * radius);
	}
	
}
