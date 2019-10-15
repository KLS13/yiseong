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
		// ����� ����		
		Computer [] com = new Computer[10];
		Notebook [] note = new Notebook[10];
		
		for(int i = 0 ; i<com.length ; i++) {
			com[i] = new Computer();
		}
		
		for(int i=0; i<note.length; i++) {
			note[i] = new Notebook();
		}
		// ��ĳ���� ( Upcastion ) Ȱ��
		// �θ�(Product) <= �ڽ�(Computer , Notebook )
		Product[] product = new Product[20];
		  
		// product[0] = new Product(); �ǹ̾��� �����ϸ� �ȵǴ� �ڵ���.
		product[0] = new Computer();
		product[1] = new Computer();
		product[2] = new Notebook();
	
		//�������� Ȯ��
		
		product[0].info();
		product[1].info();
		product[2].info();
	}

}
