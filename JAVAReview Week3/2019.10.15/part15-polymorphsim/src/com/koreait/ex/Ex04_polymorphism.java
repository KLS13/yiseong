package com.koreait.ex;

class Person {
	public void eat(String food) {
		System.out.println(food + "�Դ´�.");
	}
	public void sleep() {
		System.out.println("�ܴ�");
	}
 }

class Student extends Person {
	public void study() {
		System.out.println("�����Ѵ�.");
	}
}

class Worker extends Person {
	public void work() {
		System.out.println("���Ѵ�");
	}
}
public class Ex04_polymorphism {

	public static void main(String[] args) {
		Person person1 = new Student();
		((Student)person1).study(); 
		person1.sleep();
		person1.eat("��");
		//�ٿ�ĳ���� : Person -> Student ������ȯ
		if(person1 instanceof Student) {  // person1 �� Student �ν��Ͻ� �ΰ�?
			Student student = (Student)person1; // �ٿ� ĳ���� !
			student.eat("��");
			student.sleep();
			student.study();
		}
		
		Person person2 = new Worker();
		if(person2 instanceof Worker) {
			Worker worker = (Worker)person2;
			worker.work();
			worker.sleep();
			worker.eat("����");
		}
	}
}
