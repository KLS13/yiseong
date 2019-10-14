package com.koreait.ex;

class Person {
	
	// Method
	void sleep() {
		System.out.println("ÀÜ´Ù.");
	}
	void eat(String food) {
		System.out.println(food + " ¸Ô´Â´Ù.");
	}
	
}

class Student extends Person {
	
	// Method
	void study() {
		System.out.println("°øºÎÇÑ´Ù.");
	}
	
}

public class Ex02_inheritance {

	public static void main(String[] args) {

		Student student = new Student();
		
		student.sleep();
		student.eat("»§");
		student.study();
		
	}

}
