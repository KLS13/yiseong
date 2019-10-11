package com.koreait.ex;

public class Person {
	String name;
	int age;
	double height;
	char gender;

	Person() { }
	
	public Person(String name, int age, double height, char gender) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	
	}
	void output() {
		System.out.println("성명 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("성별 : " + gender);
	}
}

