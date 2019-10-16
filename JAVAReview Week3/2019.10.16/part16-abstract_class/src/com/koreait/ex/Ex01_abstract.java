package com.koreait.ex;

abstract class Animal {
	abstract public void move(); //추상메소드
	
	public void eat(String food) {
		System.out.println(food + "먹는다");
	}
}

class Dog extends Animal {

	@Override
	public void move() {
		System.out.println("개가 달린다");
	}
	
}


public class Ex01_abstract {

	public static void main(String[] args) {
		// Animal ani = new Animal(); --> 추상클래스는 new 를 할 수 없다.
		Animal animal = new Dog();
		
		animal.eat("개 밥");
		animal.move();
	}

}
