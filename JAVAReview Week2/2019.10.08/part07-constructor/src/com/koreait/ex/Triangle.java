package com.koreait.ex;

public class Triangle {
	
	// Field
	
	int width;
	int height;
	
	Triangle(){
		width = 1;
		height = 1;
	}
	Triangle(int w, int h) {
		width = w;
		height = h;
	}
	
	double calcArea() {
		return width*height/2.0;
	}
	void output() {
		System.out.println("너비  :  " + width);
		System.out.println("높이  :  " + height);
		System.out.println("크기  :  " + calcArea());
	}

}
