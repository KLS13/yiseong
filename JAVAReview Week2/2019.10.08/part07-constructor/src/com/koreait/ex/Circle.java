package com.koreait.ex;

public class Circle {

	//Field
	int x,y;
	double radius;
	
	// Constructor
	Circle() {
		x=0;
		y=0;
		radius=1;
	}
	Circle(double r) {
		x=0;
		y=0;
		radius =r;
	}
	Circle(int _x, int _y, double r) {
		x = _x;
		y = _y;
		radius = r;
	}
	
	double calcArea() {
		return radius * radius * Math.PI;
	}
	double calcCircum() {
		return 2*Math.PI *radius;
	}
	void output() {
		System.out.println("�߽���ǥ : (" + x + "," + y + ")");
		System.out.println("������ : " + radius);
		System.out.println("ũ�� : " + calcArea());
		System.out.println("�ѷ� : " + calcCircum());
	}
}
