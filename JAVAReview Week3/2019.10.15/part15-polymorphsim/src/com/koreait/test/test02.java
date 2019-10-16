package com.koreait.test;

class Product {

	private String model;
	private int price;
	
	public Product(String model, int price) {
		this.model = model;
		this.price = price;
	}

	public String getModel() {
		return model;
	}

	public int getPrice() {
		return price;
	}
	
}

class Tv extends Product {

	public Tv(String model, int price) {
		super(model, price);
	}
}

class Computer extends Product {

	public Computer(String model, int price) {
		super(model, price);
	}
}

class Customer {

	private int money;
	private int bonusPoint;
	private Product[] cart = new Product[10];
	private int numOfProduct; // �ε���
	
	public Customer(int money) {// �ű԰�
		this(money,0);
	}
	public Customer(int money, int bonusPoint) {
		this.money = money;
		this.bonusPoint = bonusPoint;
	}
	public void buy(Product product) { // �Ű������� �θ� �� ( �ڽ��� �� ���� )
		if(money < product.getPrice()) {
			System.out.println(" �ܾ� ���� ! ");
			return;
		}
		money -= product.getPrice();
		
		bonusPoint = (int)(product.getPrice() * 0.05);
		
		cart[numOfProduct++] = product;
	}
	

	public void output() {
		int total = 0;
		for(int i=0; i<numOfProduct; i++) {
			System.out.println(cart[i].getModel() + ", " + cart[i].getPrice());
			total += cart[i].getPrice();
		}
		System.out.println("���� �ݾ� : " + total );
		System.out.println("���ʽ� ����Ʈ : " + bonusPoint);
		System.out.println("���� �ݾ� : " + money);
		
	}
	
	
}
public class test02 {

	public static void main(String[] args) {
		
		Tv tv = new Tv("Lg",659000);
		Computer com = new Computer("TG",314000);
		Customer person1 = new Customer(1000000);
		Customer person2 = new Customer(2050000,300);
		
		person1.buy(tv);
		person1.buy(com);
		person2.buy(new Tv("�Ｚ",550000));
		person2.buy(new Computer("�Ѽ�",1300000));
		person1.output();
		person2.output();
		
		
		
	}

}
