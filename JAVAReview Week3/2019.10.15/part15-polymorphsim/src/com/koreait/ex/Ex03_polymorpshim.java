package com.koreait.ex;

class Animal {
	public void move() {
		System.out.println("동물이 움직인다");
	}
}

class Dog extends Animal{

	@Override
	public void move() {
		System.out.println("개가 달린다");
	}
}
class Dolphin extends Animal{

	@Override
	public void move() {
		System.out.println("돌고래가 헤엄친다");
	}
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("독수리가 난다");
	}
	public void fly() {
		System.out.println("독수리가 날개로 날아다님");
	}
}

public class Ex03_polymorpshim {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Dog();
		animals[1] = new Dolphin();
		animals[2] = new Eagle();
		
		// animals[2].fly(); --> 부모클래스는 fly 메소드가 없기에 호출 불가 
		
		for(int i=0; i<animals.length; i++) {
			animals[i].move();
			
		}
		
		if(animals[2] instanceof Eagle) {
			Eagle eagle = (Eagle)animals[2];
			eagle.fly();
		}
		
		((Eagle)animals[2]).fly();
		
		//개가 달린다.
		//돌고래가 헤엄친다
		//독수리가 난다
	}

}
