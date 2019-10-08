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
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("성명 : " + name);
	}
	
}
