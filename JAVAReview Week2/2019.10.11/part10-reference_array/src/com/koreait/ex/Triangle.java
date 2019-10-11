package com.koreait.ex;

public class Triangle {
	
	int width;
	int height;
	
	Triangle()  { };
	Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	double calcArea() {
		return width * height / 2.0;
	}
	void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + width);
		System.out.println("크기 : " + calcArea());
	}

}
