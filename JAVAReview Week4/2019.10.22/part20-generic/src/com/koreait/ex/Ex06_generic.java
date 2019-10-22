package com.koreait.ex;

//바구니
class Basket <T> {
	
	// Field
	private T[] foods;
	
	// Constructor
	@SuppressWarnings("unchecked")
	public Basket(int length) {
		foods = (T[])(new Object[length]);
	}
	
	// Method
	public void add(T food) {
		for (int i = 0; i < foods.length; i++) {
			if (foods[i] == null) {
				foods[i] = food;
				break;
			}
		}
	}
}
class Food { }
class Apple extends Food{ }
class Banana extends Food{ }
class Bread extends Food{ }
/*
 interface Eatable { }
 class Apple implements Eatable{ }
 class Banana implements Eatable{ }
 class Bread implements Eatable{ }
 */
// 비음식
class Computer { }
	

public class Ex06_generic {

	public static void main(String[] args) {
		
		Basket<Food> basket = new Basket<>(5);
		/* Basket<Eatable> basket = new Basket<>(5);  인터페이스를 사용했을 경우 */
		
		basket.add(new Apple());
		basket.add(new Banana());
		basket.add(new Bread());
		// basket.add(new Computer());    // 이 부분을 막고 싶다. (Food 에 묶여있지 않는 컴퓨터는 실행될 수 없다 )
		// 즉 Food food = new Computer() 은 안됨.

		
		
	}

}
