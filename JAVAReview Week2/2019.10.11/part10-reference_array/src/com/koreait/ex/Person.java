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
		System.out.println("���� : " + name);
		System.out.println("���� : " + age);
		System.out.println("���� : " + height);
		System.out.println("���� : " + gender);
	}
}

