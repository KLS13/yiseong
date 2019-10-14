package com.koreait.test;

class Person {
	
	// Field
	String name;
	int age;
	
	// Constructor
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// Method
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}
	
}

class Student extends Person {
	
	// Field
	String school;
	
	// Constructor
	Student(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	
	// Method
	void output() {
		super.output();		// Person 클래스의 output() 메소드 호출!
		System.out.println("학교 : " + school);
	}
	
}

class Worker extends Person {
	
	// Field
	String job;
	
	// Constructor
	Worker(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}
	
	// Method
	void output() {
		super.output();
		System.out.println("직업 : " + job);
	}
	
}

public class Test01 {

	public static void main(String[] args) {

		Student student = new Student("alice", 20, "이화여대");
		Worker worker = new Worker("james", 25, "삼성");
		
		student.output();
		worker.output();
		
	}

}

