package com.koreait.ex;
//Ŭ������ 2�� �̻��� ���
// public Ű����� ���ϸ�� ��ġ�ϴ� Ŭ�������� ����Ѵ�.

 class Person {
	// Field
	char gender;
	int age;
	double height;
	String name;
	
	// Method
	void info() {
		System.out.println("���� : " + gender);
		System.out.println("���� : " + age);
		System.out.println("���� : " + height);
		System.out.println("���� : " + name);
	}
}


public class PersonMain {

	public static void main(String[] args) {
		Person woman = new Person();
		Person man = new Person();
		
		woman.gender = '��';
		woman.age = 20;
		woman.height = 168.5;
		woman.name = "alice";
		
		man.gender = '��';
		man.age = 21;
		man.height = 178.5;
		man.name = "james";
		
		woman.info();
		man.info();
	}

}
