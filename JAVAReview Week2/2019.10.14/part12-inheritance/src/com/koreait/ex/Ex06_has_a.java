package com.koreait.ex;

class Engine {
	
	// Field
	String fuel;
	
	// Constructor
	Engine(String fuel) {
		this.fuel = fuel;
	}
	
	// Method
	void engineInfo() {
		System.out.println("사용 연료 : " + fuel);
		System.out.println(fuel.equals("가솔린") ? "가솔린엔진" : "디젤엔진");
	}
	
}

class Suv extends Engine {
	
	// Field
	String model;
	
	// Constructor
	Suv(String fuel, String model) {
		super(fuel);
		this.model = model;
	}
	
	// Method
	void suvInfo() {
		System.out.println("모델 : " + model);
		super.engineInfo();
	}
	
}

public class Ex06_has_a {

	// 확인 후 Test02.java 로 이동하세요.
	
	public static void main(String[] args) {

		Suv suv1 = new Suv("가솔린", "싼타페");
		Suv suv2 = new Suv("디젤", "쏘렌토");
		
		suv1.suvInfo();
		suv2.suvInfo();
		
	}

}
