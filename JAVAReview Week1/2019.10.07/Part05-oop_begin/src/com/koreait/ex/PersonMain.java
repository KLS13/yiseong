package com.koreait.ex;
//클래스가 2개 이상인 경우
// public 키워드는 파일명과 일치하는 클래스에만 명시한다.

 class Person {
	// Field
	char gender;
	int age;
	double height;
	String name;
	
	// Method
	void info() {
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("신장 : " + height);
		System.out.println("성명 : " + name);
	}
}


public class PersonMain {

	public static void main(String[] args) {
		Person woman = new Person();
		Person man = new Person();
		
		woman.gender = '여';
		woman.age = 20;
		woman.height = 168.5;
		woman.name = "alice";
		
		man.gender = '남';
		man.age = 21;
		man.height = 178.5;
		man.name = "james";
		
		woman.info();
		man.info();
	}

}
