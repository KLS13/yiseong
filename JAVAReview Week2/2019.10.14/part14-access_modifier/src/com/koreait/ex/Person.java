package com.koreait.ex;

public class Person {

	// Field (default ���� �������� ���)
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
		// �̸��� ���̴� �ݵ�� 2 �̻��̾�� �Ѵ�.
		if (name.length() >= 2) {
			this.name = name;
		}
	}
	public void setAge(int age) {
		// ������ 0 ~ 150 ���̸� �����ϴ�.
		if (age >= 0 && age <= 150) {
			this.age = age;
		}
	}
	public void setHeight(double height) {
		// Ű�� 0 ~ 300 ���̸� �����ϴ�.
		if (height >= 0 && height <= 300) {
			this.height = height;
		}
	}
	public void setGender(char gender) {
		// ������ '��', '��'�� �����ϴ�.
		if (gender == '��' || gender == '��') {
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










