package com.koreait.ex;

public class Rect {
	int width;
	int height;
	boolean isSquare;
	
	//Constructor
	//�������̴�.
	//��ü(�ν��Ͻ�)�� �����Ҷ� ȣ��Ǵ� �޼ҵ�
	//��ü �ʱ�ȭ �뵵�� ����Ѵ�.
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
		System.out.println("�ʺ� : " + width);
		System.out.println("���� : " + height);
		System.out.println("ũ�� : " + calcArea());
	}
	int calcArea() {
		return width*height;
	}

}
