package com.koreait.ex;

class Person {
	public void eat(String food) {
		System.out.println(food + "먹는다.");
	}
	public void sleep() {
		System.out.println("잔다");
	}
 }

class Student extends Person {
	public void study() {
		System.out.println("공부한다.");
	}
}

class Worker extends Person {
	public void work() {
		System.out.println("일한다");
	}
}
public class Ex04_polymorphism {

	public static void main(String[] args) {
		Person person1 = new Student();
		((Student)person1).study(); 
		person1.sleep();
		person1.eat("빵");
		//다운캐스팅 : Person -> Student 강제변환
		if(person1 instanceof Student) {  // person1 이 Student 인스턴스 인가?
			Student student = (Student)person1; // 다운 캐스팅 !
			student.eat("밥");
			student.sleep();
			student.study();
		}
		
		Person person2 = new Worker();
		if(person2 instanceof Worker) {
			Worker worker = (Worker)person2;
			worker.work();
			worker.sleep();
			worker.eat("피자");
		}
	}
}
