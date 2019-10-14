package com.koreait.ex;

public class Person {

	// Field (default 접근 지시자인 경우)
	/*
	String name;
	int age;
	double height;
	char gender;
	*/
	
	// Field
	private String name;
	private int age;
	private double height;
	private char gender;
	
	// Constructor
	public Person() { }
	public Person(String name, int age, double height, char gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}
	
	// Method
	public void setName(String name) {
		// 이름의 길이는 반드시 2 이상이어야 한다.
		if (name.length() >= 2) {
			this.name = name;
		}
	}
	public void setAge(int age) {
		// 나이의 0 ~ 150 사이만 가능하다.
		if (age >= 0 && age <= 150) {
			this.age = age;
		}
	}
	public void setHeight(double height) {
		// 키는 0 ~ 300 사이만 가능하다.
		if (height >= 0 && height <= 300) {
			this.height = height;
		}
	}
	public void setGender(char gender) {
		// 성별은 '남', '여'만 가능하다.
		if (gender == '남' || gender == '여') {
			this.gender = gender;
		}
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public char getGender() {
		return gender;
	}
	
}










