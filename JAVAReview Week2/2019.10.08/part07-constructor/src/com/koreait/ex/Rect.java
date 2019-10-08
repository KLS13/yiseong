package com.koreait.ex;

public class Rect {
	int width;
	int height;
	boolean isSquare;
	
	//Constructor
	//생성자이다.
	//객체(인스턴스)를 생성할때 호출되는 메소드
	//객체 초기화 용도로 사용한다.
	Rect() {
		width = 1;
		height = 1;
		isSquare = true;
	}
	Rect(int side) {
		width = side;
		height = side;
		isSquare = true;
	}
	Rect(int w, int h) {
		width = w;
		height = h;
		isSquare = (w==h) ?  true : false;
	}
	//method
	void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
	}
	int calcArea() {
		return width*height;
	}

}
