package com.koreait.ex;

/*
 * �ڽ�Ŭ������ �����ڴ� �θ�Ŭ������ �����ڸ� ���� ȣ���Ѵ�.
 * (�ڽ��� ����������� �θ� ���� ������ �Ѵ�.)
 */

class Mother {
	
	// Constructor
	Mother() {
		System.out.println("Mother ����!");
	}
	
}

class Son extends Mother {
	
	// Constructor
	Son() {
		System.out.println("Son ����!");
	}
	
	// Method
	void doSon() {
		System.out.println("doSun() ȣ��!");
	}
	
}

public class Ex04_constructor {

	public static void main(String[] args) {

		Son son = new Son();
		son.doSon();
		
	}

}
