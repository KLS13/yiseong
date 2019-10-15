package com.koreait.ex;

class Shape {
	public double calcArea() {
		return 0;  // 리턴의 의미는 없음.
	}
}
class Rect extends Shape{
	private int width;
	private int height;
	
	public Rect(int width, int height) {
		this.width  = width;
		this.height = height;
	}
	@Override
	public double calcArea() {
		return width*height;
	}
}

class Triangle extends Shape{
	private int width;
	private int height;
	
	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		
		return width*height/2.0;
	}
}

class Circle extends Shape{
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius, 2);
	}
}

public class Ex02_polymorpshim {

	public static void main(String[] args) {
		//도형 관리 ( 모든 도형의 부모는  Shape 이다. )
		Shape[] arr =  new Shape[3];
		arr[0] = new Rect(2,3);
		arr[1] = new Triangle(2,3);
		arr[2] = new Circle(1);
		
		for(int i = 0; i<arr.length; i++) {
			System.out.println("크기 : " + arr[i].calcArea()); 
		}

	}

}
