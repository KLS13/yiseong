package com.koreait.ex;

interface Animal {
	void move(); // �ڵ����� public abstract void move()��
	default void eat(String food) { 
		System.out.println(food+ "�Դ´�");
	}
}
class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("���� �޸���.");
	}
}


public class Ex01_interface {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat("����");
		animal.move();
	}

}
