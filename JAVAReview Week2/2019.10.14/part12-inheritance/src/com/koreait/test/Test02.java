package com.koreait.test;

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

class Suv {
	
	// Field
	String model;
	Engine engine;	// include
	
	// Constructor
	Suv(String model, Engine engine) {
		this.model = model;
		this.engine = engine;
	}
	
	// Method
	void suvInfo() {
		System.out.println("모델 : " + model);
		engine.engineInfo();
	}
	
}

public class Test02 {

	public static void main(String[] args) {

		Suv suv1 = new Suv("XC60", new Engine("가솔린"));
		suv1.suvInfo();
		
		Engine engine = new Engine("디젤");
		Suv suv2 = new Suv("XC90", engine);
		suv2.suvInfo();
		
	}

}
