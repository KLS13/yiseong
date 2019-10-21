package com.koreait.ex;

// 제네릭 클래스
class Bag <T> {		// T : 자료형
	
	// Field
	private T obj;
	
	// Method
	public void setObj(T obj) {
		this.obj = obj;
	}
	public T getObj() {
		return obj;
	}
	
}

class Ball { }
class Pen { }

public class Ex02_generic {

	public static void main(String[] args) {
		
		//Bag<Ball> bag = new Bag<Ball>();
		Bag<Ball> bag = new Bag<>();
		
		bag.setObj(new Ball());
		Ball ball = bag.getObj();
		System.out.println(ball);

		
		
	}

}
