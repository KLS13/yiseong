package com.koreait.ex;

class Car {
	
	// Method
	void drive() {
		System.out.println("���� �޸���.");
	}
	
}

class Ev extends Car {
	
	// Method
	void charging() {
		System.out.println("���⸦ �����Ѵ�.");
	}
	
}

public class Ex03_inheritance {

	public static void main(String[] args) {

		Ev ev = new Ev();
		
		ev.drive();
		ev.charging();
		
	}

}
