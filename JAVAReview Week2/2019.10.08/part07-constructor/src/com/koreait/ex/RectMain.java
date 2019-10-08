package com.koreait.ex;

public class RectMain {

	public static void main(String[] args) {
		
		// 1. 객체(인스턴스) 생성
		// ===>>> 생성자가 호출된다 !
		Rect nemo1 = new Rect();
		Rect nemo2 = new Rect(3);
		Rect nemo3 = new Rect(3,5);
		
		nemo1.output();
		nemo2.output();
		nemo3.output();

	}

}
