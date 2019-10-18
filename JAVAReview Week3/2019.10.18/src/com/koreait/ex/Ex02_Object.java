package com.koreait.ex;

class Computer {
	
	private String model;
	private int price;
	
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		String info = "모델 : " + model + ", 가격 : " + price + "원";
		return info;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Computer) {
			return model.equals(((Computer)obj).model) && price == ((Computer)obj).price;
		} else {
		return false;
		}
	}
}

public class Ex02_Object {

	public static void main(String[] args) {
		Computer com1 = new Computer("삼성센스",100 );
		Computer com2 = new Computer("삼성센스",100 );
		System.out.println(com1);
		System.out.println(com2);
		
		if(com1 == com2) {
			System.out.println("같은 종류의 컴퓨터");
		}else {
			System.out.println("다른종류");;
		}
		// 2. equals
		// 1) Object 의 equals 메소드 : 객체 비교 불가 !
		// 2) Computer 클래스에 equals 메소드 오버라이드 하면 : 객체 비교 가능!
		
		if(com1.equals(com2)) {
			System.out.println("같은 종류의 컴퓨터");
		}else {
			System.out.println("다른종류");;
			
		}
		

	}

}
