package com.koreait.test;

public class Circle {

	// Field
	double radius;
	final double PI = 3.141592;		// ���� ������ �ƴ�
	String name;
	
	// Method
	void info() {
		System.out.println("������ : " + radius);
		System.out.println("�̸� : " + name);
		System.out.println("ũ�� : " + radius * radius * PI);
		System.out.println("�ѷ� : " + 2 * PI * radius);
	}
	
}
