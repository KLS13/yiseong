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
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
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
		super.output();		// Person Ŭ������ output() �޼ҵ� ȣ��!
		System.out.println("�б� : " + school);
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
		System.out.println("���� : " + job);
	}
	
}

public class Test01 {

	public static void main(String[] args) {

		Student student = new Student("alice", 20, "��ȭ����");
		Worker worker = new Worker("james", 25, "�Ｚ");
		
		student.output();
		worker.output();
		
	}

}

