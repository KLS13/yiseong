package com.koreait.ex;

public class RectMain {

	public static void main(String[] args) {
		//��ü ����
		Rect rec1 = new Rect();
		Rect rec2 = new Rect();
		
		//�޼ҵ� ȣ��
		rec1.setFields(3, 4);
		rec2.setFields(3);
		rec1.output();
		rec2.output();

	}

}
