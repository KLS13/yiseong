package com.koreait.ex;

class Car {
	
	// Method
	void drive() {
		System.out.println("차가 달린다.");
	}
	
}

class Ev extends Car {
	
	// Method
	void charging() {
		System.out.println("전기를 충전한다.");
	}
	
}

public class Ex03_inheritance {

	public static void main(String[] args) {

		Ev ev = new Ev();
		
		ev.drive();
		ev.charging();
		
	}

}
