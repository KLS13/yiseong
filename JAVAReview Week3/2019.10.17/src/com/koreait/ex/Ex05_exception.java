package com.koreait.ex;

interface Animal {
	void walk();
}

class Dog implements Animal {
	@Override
	public void walk() {
		System.out.println("��å�Ѵ�");
	}
	public void sleepTogether() {
		System.out.println("���� ����.");
	}
}

class Crocodile implements Animal {
	@Override
	public void walk() {
		System.out.println("�Ǿ����");
	}
}
public class Ex05_exception {
	
	/* instanceof �����ڸ� �̿��� ����ó��
	 public static void verify(Animal animal) {
	 
		if (animal instanceof Dog) {
			((Dog)animal).sleepTogether();
		}else {
			System.out.println("Dog�� �ƴ϶� �Բ� ����");
			
		}
	}
*/
	public static void action(Animal animal) {
		try {
			((Dog)animal).sleepTogether();
		}catch(Exception e) {
			System.out.println("���� ����");
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
	
		action(new Dog());
		action(new Crocodile());
		
	}

}
