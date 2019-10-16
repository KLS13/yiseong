package com.koreait.ex;

interface Animal {
	void move(); // 자동으로 public abstract void move()을
	default void eat(String food) { 
		System.out.println(food+ "먹는다");
	}
}
class Dog implements Animal {

	@Override
	public void move() {
		System.out.println("개가 달린다.");
	}
}


public class Ex01_interface {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat("개밥");
		animal.move();
	}

}
