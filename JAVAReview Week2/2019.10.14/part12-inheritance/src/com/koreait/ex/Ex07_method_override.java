package com.koreait.ex;

class Espresso {
	
	// Field
	String origin;
	
	// Constructor
	Espresso(String origin) {
		this.origin = origin;
	}
	
	// Method
	void taste() {
		System.out.println("강렬하다.");
	}
	
}

class Latte extends Espresso {
	
	// Field
	String milk;
	
	// Constructor
	Latte(String origin, String milk) {
		super(origin);
		this.milk = milk;
	}
	
	// Method
	@Override
	void taste() {
		System.out.println("부드럽다.");
	}
	
}

public class Ex07_method_override {

	public static void main(String[] args) {

		Latte latte = new Latte("인도네시아", "서울우유");
		latte.taste();
		
	}

}
