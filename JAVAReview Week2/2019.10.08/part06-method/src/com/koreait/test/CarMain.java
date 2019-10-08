package com.koreait.test;

public class CarMain {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.setFields("차1","빨강", 1994);
		car2.setFields("차2", "화이트");
		car3.setFields("차3","블랙",2019);
		
		car1.ouput();
		car2.ouput();
		car3.ouput();
	}

}
