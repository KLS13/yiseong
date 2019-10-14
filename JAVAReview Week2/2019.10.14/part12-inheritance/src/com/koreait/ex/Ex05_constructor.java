package com.koreait.ex;

/*
 * super
 * 
 * 	1. �ڽ�Ŭ������ �˰� �ִ� �θ�Ŭ������ ����(�ּ�)
 * 	2. ���
 * 		1) super.�ʵ�		: �θ�Ŭ������ �ʵ� ���
 * 		2) super.�޼ҵ�()	: �θ�Ŭ������ �޼ҵ� ���
 * 		3) super()			: �θ�Ŭ������ ������ ���
 */

class Animal {
	
	// Field
	String name;
	
	// Constructor
	Animal() { }
	Animal(String name) {
		this.name = name;
	}
	
}

class Dog extends Animal {
	
	// Field
	String personName;
	
	// Constructor
	Dog(String personName) {
		super();		// ����Ŭ������ ������ : Animal() { } ȣ��!
		this.personName = personName;
	}
	Dog(String name, String personName) {
		super(name);	// ����Ŭ������ ������ : Animal(String name) { } ȣ��!
		this.personName = personName;
	}
	
	// Method
	void whoAmI() {
		System.out.println("�� �̸��� " + name + "�̰�, ������ " + personName + "�Դϴ�.");
	}
	
}

public class Ex05_constructor {

	public static void main(String[] args) {

		Dog dog = new Dog("alice");
		dog.whoAmI();
		
		Dog dog2 = new Dog("�̻���", "�̸���");
		dog2.whoAmI();
		
	}

}
