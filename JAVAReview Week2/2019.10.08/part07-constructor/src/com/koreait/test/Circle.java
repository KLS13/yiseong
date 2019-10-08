package com.koreait.test;

public class Circle {

	// Field
	Coordinate center;
	double radius;
	
	// Constructor
	Circle(int _x, int _y, double _radius) {
		center = new Coordinate(_x, _y);
		radius = _radius;
	}
	Circle(Coordinate _center, double _radius) {
		center = _center;
		radius = _radius;
	}
	
	// Method
	void output() {
		center.output(); 	// [x, y]
		System.out.println("¹ÝÁö¸§ : " + radius);
	}
	
}
