package com.koreait.ex;

public class Triangle {
	
	// Field
	
	private int width;
	private int height;
	
	public Triangle(){
		this(1,1);
	}
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	double calcArea() {
		return width*height/2.0;
	}
	public void output() {
		System.out.println("너비  :  " + width);
		System.out.println("높이  :  " + height);
		System.out.println("크기  :  " + calcArea());
	}

}
