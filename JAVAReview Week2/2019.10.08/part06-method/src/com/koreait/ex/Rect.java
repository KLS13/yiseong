package com.koreait.ex;
/*
 �޼ҵ� �����ε�
 	1. �޼ҵ� �̸��� ����.
 	2. �Ű������� �ٸ���.
 */

public class Rect {
		
	//�ʵ�
	int width; //�ʺ�
	int height; //����
	boolean isSquare; //���簢�� false  ���簢�� true
	
	//�޼ҵ�
	void setFields(int w, int h) {
		width = w;
		height = h;
		isSquare = (w==h) ? true : false;
	}
	void setFields(int side) {
		width = side;
		height = side;
		isSquare = true;
	}
	int calcArea() {
		return width*height;
	}
	void output() {
		System.out.println("�ʺ� : " + width);
		System.out.println("���� : " + height);
		System.out.println("ũ�� : " + calcArea());
		System.out.println(isSquare ? "���簢��" : "���簢��");
	}

}
