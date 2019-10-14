package com.koreait.ex;

/*
 * 자식클래스의 생성자는 부모클래스의 생성자를 먼저 호출한다.
 * (자식이 만들어지려면 부모 먼저 만들어야 한다.)
 */

class Mother {
	
	// Constructor
	Mother() {
		System.out.println("Mother 생성!");
	}
	
}

class Son extends Mother {
	
	// Constructor
	Son() {
		System.out.println("Son 생성!");
	}
	
	// Method
	void doSon() {
		System.out.println("doSun() 호출!");
	}
	
}

public class Ex04_constructor {

	public static void main(String[] args) {

		Son son = new Son();
		son.doSon();
		
	}

}
