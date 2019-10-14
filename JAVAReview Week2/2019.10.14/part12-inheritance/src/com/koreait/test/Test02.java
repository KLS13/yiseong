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
		System.out.println("��� ���� : " + fuel);
		System.out.println(fuel.equals("���ָ�") ? "���ָ�����" : "��������");
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
		System.out.println("�� : " + model);
		engine.engineInfo();
	}
	
}

public class Test02 {

	public static void main(String[] args) {

		Suv suv1 = new Suv("XC60", new Engine("���ָ�"));
		suv1.suvInfo();
		
		Engine engine = new Engine("����");
		Suv suv2 = new Suv("XC90", engine);
		suv2.suvInfo();
		
	}

}
