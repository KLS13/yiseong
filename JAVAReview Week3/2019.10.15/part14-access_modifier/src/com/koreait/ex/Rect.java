package com.koreait.ex;

public class Rect {
	private int width;
	private int height;
	private boolean isSquare;
	
	//Constructor
	//생성자이다.
	//객체(인스턴스)를 생성할때 호출되는 메소드
	//객체 초기화 용도로 사용한다.
	public Rect() {
		this(1,1);
		this.isSquare = true;
	}
	public Rect(int side) {
		this(side, side);
	}
	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
		this.isSquare = (width==height) ?  true : false;
	}
	//method
	public void output() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
		System.out.println("모양 : " + (isSquare ? "정사각형" : "직사각형"));
	}
	int calcArea() {
		return width*height;
	}

}
