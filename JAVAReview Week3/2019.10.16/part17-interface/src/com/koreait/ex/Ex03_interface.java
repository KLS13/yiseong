package com.koreait.ex;
// 인터페이스명 :  ~~ 할 수 있는
interface Eatable {
	void eat();
}

class My {
	public void dirty() {
		System.out.println("내껀 더럽지.");
	}
}

class Apple extends My implements Eatable {
	@Override
	public void eat() {
		System.out.println("사과는 아침에 먹는것이 좋다");
	}
}

class Banana extends My implements Eatable {
	@Override
	public void eat() {
		System.out.println("바나나 껍질은 드시지 마시오");
	}
}

class Computer extends My {
	
}
public class Ex03_interface {

	public static void main(String[] args) {
		
		My[] list = new My[3];
		
		list[0] = new Apple();
		list[1] = new Banana();
		list[2] = new Computer();
		
		for(int i = 0; i<list.length; i++) {
			list[i].dirty();
			if(list[i] instanceof Eatable) {
			((Eatable)list[i]).eat();
			}
		}

	}

}
