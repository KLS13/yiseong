package com.koreait.ex;

abstract class Animal {
	abstract public void move(); //�߻�޼ҵ�
	
	public void eat(String food) {
		System.out.println(food + "�Դ´�");
	}
}

class Dog extends Animal {

	@Override
	public void move() {
		System.out.println("���� �޸���");
	}
	
}


public class Ex01_abstract {

	public static void main(String[] args) {
		// Animal ani = new Animal(); --> �߻�Ŭ������ new �� �� �� ����.
		Animal animal = new Dog();
		
		animal.eat("�� ��");
		animal.move();
	}

}
