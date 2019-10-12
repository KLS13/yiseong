package com.koreait.ex;

public class Ex02_Random {

	public static void main(String[] args) {

		/*
		 * Math 클래스
		 * 객체(인스턴스) 생성이 없다.
		 * Math.random() 메소드를 이용
		 * 랜덤생성 범위 : 0~0.999999
		 * 원하는 랜덤 생성 범위
		 * 	(int)(Math.random() * n) + a : a부터 n개의 랜덤발생
		 */

		System.out.println((int)(Math.random()*6)+1);
		//확률처리 0% ~ 99.999999%
		
		System.out.println(Math.random() <= 0.05 ? "대박" : "꽝");
	}

}
