package com.koreait.ex;

interface Animal {
	void walk();
}

class Dog implements Animal {
	@Override
	public void walk() {
		System.out.println("산책한다");
	}
	public void sleepTogether() {
		System.out.println("같이 자자.");
	}
}

class Crocodile implements Animal {
	@Override
	public void walk() {
		System.out.println("악어걸음");
	}
}
public class Ex05_exception {
	
	/* instanceof 연산자를 이용한 예외처리
	 public static void verify(Animal animal) {
	 
		if (animal instanceof Dog) {
			((Dog)animal).sleepTogether();
		}else {
			System.out.println("Dog가 아니라서 함께 못자");
			
		}
	}
*/
	public static void action(Animal animal) {
		try {
			((Dog)animal).sleepTogether();
		}catch(Exception e) {
			System.out.println("같이 못잠");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	
		action(new Dog());
		action(new Crocodile());
		
	}

}
