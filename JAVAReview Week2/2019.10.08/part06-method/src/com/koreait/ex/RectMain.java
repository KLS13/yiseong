package com.koreait.ex;

public class RectMain {

	public static void main(String[] args) {
		//객체 생성
		Rect rec1 = new Rect();
		Rect rec2 = new Rect();
		
		//메소드 호출
		rec1.setFields(3, 4);
		rec2.setFields(3);
		rec1.output();
		rec2.output();

	}

}
