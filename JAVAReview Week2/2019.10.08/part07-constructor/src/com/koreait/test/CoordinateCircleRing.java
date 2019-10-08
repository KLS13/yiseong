package com.koreait.test;

public class CoordinateCircleRing {

	public static void main(String[] args) {

		Coordinate coordinate1 = new Coordinate(0, 0);
		Circle circle1 = new Circle(coordinate1, 1.0);
		Circle circle2 = new Circle(5, 5, 2.0);
		Ring ring1 = new Ring(circle1, circle2);
		Ring ring2 = new Ring(10, 10, 3.0, 20, 20, 4.0);
		ring1.output();
		ring2.output();	
	}
}
