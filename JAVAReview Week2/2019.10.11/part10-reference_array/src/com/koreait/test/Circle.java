package com.koreait.test;

public class Circle {
	double radius;
	
	Circle() { }
	
	Circle(double radius) {
		this.radius = radius;
	}
	double calcArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	void output() {
		System.out.println("������ : " + radius);
		System.out.println("ũ�� : " + calcArea());
	}
	
	
	
	
	
	
		
		
	}

