package com.koreait.test;

class Computer {
	
	// Field
	String model;
	int price;
	
	// Constructor
	Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	// Method
	void output() {
		System.out.println("¸ðµ¨ : " + model);
		System.out.println("°¡°Ý : " + price);
	}
	
}

class Notebook extends Computer {
	
	// Field
	int battery;
	
	// Constructor
	Notebook(String model, int price, int battery) {
		super(model, price);
		this.battery = battery;
	}
	
	// Method
	@Override
	void output() {
		super.output();
		System.out.println("¹èÅÍ¸® ¿ë·® : " + battery);
	}
	
}

class Tablet extends Notebook {
	
	// Field
	String pen;
	
	// Constructor
	Tablet(String model, int price, int battery, String pen) {
		super(model, price, battery);
		this.pen = pen;
	}
	
	// Method
	@Override
	void output() {
		super.output();
		System.out.println("Ææ : " + pen);
	}
	
}

public class Test03 {

	public static void main(String[] args) {

		Notebook notebook = new Notebook("gram", 100, 70);
		Tablet tablet = new Tablet("note", 120, 50, "s-pen");
		
		notebook.output();
		tablet.output();
		
	}

}
