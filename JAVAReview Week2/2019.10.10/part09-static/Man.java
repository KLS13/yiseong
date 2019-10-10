package com.koreait.ex;

public class Man {
	String name;
	int age;
	final static char GENDER = '남';
	
	Man(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void output() {
		System.out.println("성명 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + GENDER);
	}
	
}
