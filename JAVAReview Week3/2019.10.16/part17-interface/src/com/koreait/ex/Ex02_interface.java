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
		System.out.println("�ʺ� : " + width);
		System.out.println("���� : " + height);
		System.out.println("ũ�� : " + calcArea());
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
		System.out.println("������ : " + radius);
		System.out.println("���� : " + calcArea());
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
