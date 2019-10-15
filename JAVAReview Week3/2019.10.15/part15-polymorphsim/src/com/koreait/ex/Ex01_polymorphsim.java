package com.koreait.ex;

class Product {
	public void info() {
		System.out.println("Product");
	}
}

class Computer extends Product {
	@Override
	public void info() {
		System.out.println("Computer");
	}
}

class Notebook extends Computer {
	@Override
	public void info() {
		System.out.println("Notebook");
	}
	
}
public class Ex01_polymorphsim {

	public static void main(String[] args) {
		// 여기는 상점		
		Computer [] com = new Computer[10];
		Notebook [] note = new Notebook[10];
		
		for(int i = 0 ; i<com.length ; i++) {
			com[i] = new Computer();
		}
		
		for(int i=0; i<note.length; i++) {
			note[i] = new Notebook();
		}
		// 업캐스팅 ( Upcastion ) 활용
		// 부모(Product) <= 자식(Computer , Notebook )
		Product[] product = new Product[20];
		  
		// product[0] = new Product(); 의미없고 존재하면 안되는 코드임.
		product[0] = new Computer();
		product[1] = new Computer();
		product[2] = new Notebook();
	
		//다형성의 확인
		
		product[0].info();
		product[1].info();
		product[2].info();
	}

}
