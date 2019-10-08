package com.koreait.test;

public class Coordinate {

	// Field
	int x;
	int y;
	
	// Constructor
	Coordinate(int _x, int _y) {
		x = _x;
		y = _y;
	}
	
	// Method
	void output() {
		System.out.println("[" + x + ", " + y + "]");
	}
	
}
