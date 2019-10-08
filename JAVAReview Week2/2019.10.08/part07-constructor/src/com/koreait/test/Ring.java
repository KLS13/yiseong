package com.koreait.test;

public class Ring {

	// Field
	Circle inner;
	Circle outer;
	
	// Constructor
	Ring(int _x1, int _y1, double _radius1, int _x2, int _y2, double _radius2) {
		inner = new Circle(_x1, _y1, _radius1);
		outer = new Circle(_x2, _y2, _radius2);
	}
	Ring(Circle _inner, Circle _outer) {
		inner = _inner;
		outer = _outer;
	}
	
	// Method
	void output() {
		System.out.println("���� ���� ����");
		inner.output();
		System.out.println("�ٱ��� ���� ����");
		outer.output();
	}
	
}
