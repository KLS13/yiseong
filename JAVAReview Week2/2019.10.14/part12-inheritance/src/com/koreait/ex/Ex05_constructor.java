package com.koreait.ex;

/*
 * super
 * 
 * 	1. 자식클래스가 알고 있는 부모클래스의 참조(주소)
 * 	2. 사용
 * 		1) super.필드		: 부모클래스의 필드 사용
 * 		2) super.메소드()	: 부모클래스의 메소드 사용
 * 		3) super()			: 부모클래스의 생성자 사용
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
		super();		// 슈퍼클래스의 생성자 : Animal() { } 호출!
		this.personName = personName;
	}
	Dog(String name, String personName) {
		super(name);	// 슈퍼클래스의 생성자 : Animal(String name) { } 호출!
		this.personName = personName;
	}
	
	// Method
	void whoAmI() {
		System.out.println("내 이름은 " + name + "이고, 주인은 " + personName + "입니다.");
	}
	
}

public class Ex05_constructor {

	public static void main(String[] args) {

		Dog dog = new Dog("alice");
		dog.whoAmI();
		
		Dog dog2 = new Dog("이쁜이", "이말자");
		dog2.whoAmI();
		
	}

}
