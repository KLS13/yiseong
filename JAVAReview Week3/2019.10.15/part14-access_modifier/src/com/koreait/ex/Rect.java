package com.koreait.ex;

public class Rect {
	private int width;
	private int height;
	private boolean isSquare;
	
	//Constructor
	//�������̴�.
	//��ü(�ν��Ͻ�)�� �����Ҷ� ȣ��Ǵ� �޼ҵ�
	//��ü �ʱ�ȭ �뵵�� ����Ѵ�.
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
		System.out.println("�ʺ� : " + width);
		System.out.println("���� : " + height);
		System.out.println("ũ�� : " + calcArea());
		System.out.println("��� : " + (isSquare ? "���簢��" : "���簢��"));
	}
	int calcArea() {
		return width*height;
	}

}
