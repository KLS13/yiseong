package com.koreait.ex;

public class Man {
	String name;
	int age;
	final static char GENDER = '��';
	
	Man(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void output() {
		System.out.println("���� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + GENDER);
	}
	
}
