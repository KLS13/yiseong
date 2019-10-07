package com.koreait.test;

public class Circle_1 {
	int radius;
	String name;
	double PI = 3.14;
	
		void info(int radius, String name) {
			System.out.println(name + "원의 " + "반지름은" + radius + "넓이는" + (PI*radius*radius));
		}

}
