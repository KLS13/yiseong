package com.koreait.ex;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
		/*
		 Random 클래스
		 1. 객체(인스턴스) 생성을 한다.
		 2. 객체(인스턴스)의 메소드 호출로 난수를 발생시킴.
		 	nextInt() : int형 데이터 범위 내의 난수 발생
		 	nextDouble() : 0~0.999999 ( 0 이상 1미만 ) 범위의 난수 발생
		 	
		 */
		
		Random random = new Random();
		System.out.println(random.nextInt());
		System.out.println(random.nextInt(45));
		System.out.println(random.nextInt(6)+1);
		System.out.println(random.nextDouble());
		System.out.println(random.nextDouble()*10);
		System.out.println((int)(random.nextDouble()*10));
		// 1~6 사이 발생
		System.out.println((int)(random.nextDouble()*6)+1);

	}

}
