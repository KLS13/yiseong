package com.koreait.ex;

class Car {
	public void drive() {
		
	}
}
class Ev extends Car {
	// Method
	public void charging() {
		
	}
	public void addOil() {
		System.out.println("add");
	}
}

class Hybrid extends Ev {
	public void fuel() {
		
	}
}
public class Ex05_polymorphism {

	public static void main(String[] args) {
		Car[] moters = new Car[2];
		moters[0] = new Ev();
		moters[1] = new Hybrid();
		
		moters[0].drive();
		((Ev)moters[0]).charging();
		if(moters[0] instanceof Ev) {
			Ev ev = (Ev)moters[0];
			ev.drive();
			ev.charging();
		}
		
		moters[1].drive();
		((Hybrid)moters[1]).fuel();
		if(moters[1] instanceof Hybrid) {
			Hybrid hy = (Hybrid)moters[1];
			hy.drive();
			hy.fuel();
		}
		
		//�߸��� �ٿ�ĳ����
		((Hybrid)moters[0]).addOil(); // ��������ȯ�� ���� ������ ����...  moters[0]�� Ev�ε� Hybird�� ���� ����ȯ�� �Ǿ ���� �ȶ�.

	}

}
