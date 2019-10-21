package com.koreait.ex;
/*
 Wrapper Class :
	1. primitiveType -> referenceType
	2. 종류
		1) int  	-> Integer
		2) double   -> Double
		3) boolean  -> Boolean
		4) char		-> Character
		
	3. 변수를 객체로 변환해 주는 클래스이다.
	4. 반드시 referenceType 을 사용해야 하는 경우가 있다.
 */

public class Ex06_Wrapper {

	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		System.out.println("저장된 위치 비교 : " + (a==b)); 
		System.out.println("저장된 내용 비교 : " + a.equals(b)); // 변수가 아니고,  a b 는 객체라서 소환가능
		
		//크기 비교
		System.out.println("두 객체에 저장된 값의 크기 비교 : " + a.compareTo(b)); // 같으면 0 , a > b 결과1 , a < b  결과 -1
		
		// Auto Boxing, Auto UnBoxing
		// 값 -> 객체 : Boxing
		// 객체->값 : UnBoxing
		
		//Auto Boxing
		Integer c = 100;
		Integer d = 200;
		
		//Auto UnBoxing
		int result = c+d;
		System.out.println(result);

	}

}
