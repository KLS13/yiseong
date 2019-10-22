package com.koreait.ex;

//�ٱ���
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
// ������
class Computer { }
	

public class Ex06_generic {

	public static void main(String[] args) {
		
		Basket<Food> basket = new Basket<>(5);
		/* Basket<Eatable> basket = new Basket<>(5);  �������̽��� ������� ��� */
		
		basket.add(new Apple());
		basket.add(new Banana());
		basket.add(new Bread());
		// basket.add(new Computer());    // �� �κ��� ���� �ʹ�. (Food �� �������� �ʴ� ��ǻ�ʹ� ����� �� ���� )
		// �� Food food = new Computer() �� �ȵ�.

		
		
	}

}
