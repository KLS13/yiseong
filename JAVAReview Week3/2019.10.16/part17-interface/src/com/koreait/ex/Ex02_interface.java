package com.koreait.ex;

interface Shape {
	double PI = 3.141592; // 
	double calcArea();
	void output();
}

class Rect implements Shape {

	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double calcArea() {
		return width*height;
	}
	@Override
	public void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
	}
}

class Circle implements Shape {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return PI * Math.pow(radius, 2);
	}
	@Override
	public void output() {
		System.out.println("반지름 : " + radius);
		System.out.println("넓이 : " + calcArea());
	}
	
}
public class Ex02_interface {
	public static void main(String[] args) {
		Shape[] arr = new Shape[2];
		arr[0] = new Rect(4,5);
		arr[0].output();
		
		arr[1] = new Circle(5.5);
		arr[1].output();
	}
}
