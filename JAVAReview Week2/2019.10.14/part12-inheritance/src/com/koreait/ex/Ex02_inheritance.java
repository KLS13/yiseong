package com.koreait.ex;

class Person {
	
	// Method
	void sleep() {
		System.out.println("�ܴ�.");
	}
	void eat(String food) {
		System.out.println(food + " �Դ´�.");
	}
	
}

class Student extends Person {
	
	// Method
	void study() {
		System.out.println("�����Ѵ�.");
	}
	
}

public class Ex02_inheritance {

	public static void main(String[] args) {

		Student student = new Student();
		
		student.sleep();
		student.eat("��");
		student.study();
		
	}

}
