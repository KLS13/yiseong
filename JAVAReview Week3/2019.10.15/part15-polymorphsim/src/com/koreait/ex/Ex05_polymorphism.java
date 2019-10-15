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
		
		//잘못된 다운캐스팅
		((Hybrid)moters[0]).addOil(); // 강제형변환은 문제 소지가 있음...  moters[0]은 Ev인데 Hybird로 강제 형변환이 되어도 에러 안뜸.

	}

}
