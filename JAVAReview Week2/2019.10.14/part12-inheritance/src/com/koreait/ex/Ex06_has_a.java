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
		System.out.println("��� ���� : " + fuel);
		System.out.println(fuel.equals("���ָ�") ? "���ָ�����" : "��������");
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
		System.out.println("�� : " + model);
		super.engineInfo();
	}
	
}

public class Ex06_has_a {

	// Ȯ�� �� Test02.java �� �̵��ϼ���.
	
	public static void main(String[] args) {

		Suv suv1 = new Suv("���ָ�", "��Ÿ��");
		Suv suv2 = new Suv("����", "���");
		
		suv1.suvInfo();
		suv2.suvInfo();
		
	}

}
