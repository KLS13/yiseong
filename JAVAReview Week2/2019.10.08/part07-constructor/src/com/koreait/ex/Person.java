package com.koreait.ex;

public class Person {

	// Field
	String name;
	int age;
	double height;
	char gender;
	
	// Constructor
	Person(String _name, int _age, double _height, char _gender) {
		name = _name;
		age = _age;
		height = _height;
		gender = _gender;
	}
	
	// Method
	void output() {
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("���� : " + height);
		System.out.println("���� : " + name);
	}
	
}
