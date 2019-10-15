package com.koreait.ex;

public class Circle {

	//Field
	private int x;
	private int y;
	private double radius;
	
	// Constructor
	public Circle() {
		this(0,0,1);
	}
	public Circle(double radius) {
		this(0,0,radius);
	}	
	public Circle(int x, int y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	private double calcArea() {
		return radius * radius * Math.PI;
	}
	private double calcCircum() {
		return 2*Math.PI *radius;
	}
	public void output() {
		System.out.println("�߽���ǥ : (" + x + "," + y + ")");
		System.out.println("������ : " + radius);
		System.out.println("ũ�� : " + calcArea());
		System.out.println("�ѷ� : " + calcCircum());
	}
}
