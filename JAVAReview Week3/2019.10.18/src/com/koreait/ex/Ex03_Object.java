package com.koreait.ex;

class Person implements Cloneable {
	
	// Field
	private String name;
	private int age;
	
	// Constructor
	public Person(String name, int age) {
		this.name = name;
		this.age =age;
	}
	
	// Method
	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + age + "��";
	}
	
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
	
}

public class Ex03_Object {

	public static void main(String[] args) {

		Person woman = new Person("alice", 20);
		System.out.println(woman);
		
		Person cloneWoman = (Person) woman.clone();
		System.out.println(cloneWoman);
		
	}

}







