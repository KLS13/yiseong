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
		System.out.println("�����ϴ�.");
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
		System.out.println("�ε巴��.");
	}
	
}

public class Ex07_method_override {

	public static void main(String[] args) {

		Latte latte = new Latte("�ε��׽þ�", "�������");
		latte.taste();
		
	}

}
