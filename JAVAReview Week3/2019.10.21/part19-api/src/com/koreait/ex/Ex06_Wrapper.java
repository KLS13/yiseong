package com.koreait.ex;
/*
 Wrapper Class :
	1. primitiveType -> referenceType
	2. ����
		1) int  	-> Integer
		2) double   -> Double
		3) boolean  -> Boolean
		4) char		-> Character
		
	3. ������ ��ü�� ��ȯ�� �ִ� Ŭ�����̴�.
	4. �ݵ�� referenceType �� ����ؾ� �ϴ� ��찡 �ִ�.
 */

public class Ex06_Wrapper {

	public static void main(String[] args) {
		
		Integer a = new Integer(10);
		Integer b = new Integer(10);
		
		System.out.println("����� ��ġ �� : " + (a==b)); 
		System.out.println("����� ���� �� : " + a.equals(b)); // ������ �ƴϰ�,  a b �� ��ü�� ��ȯ����
		
		//ũ�� ��
		System.out.println("�� ��ü�� ����� ���� ũ�� �� : " + a.compareTo(b)); // ������ 0 , a > b ���1 , a < b  ��� -1
		
		// Auto Boxing, Auto UnBoxing
		// �� -> ��ü : Boxing
		// ��ü->�� : UnBoxing
		
		//Auto Boxing
		Integer c = 100;
		Integer d = 200;
		
		//Auto UnBoxing
		int result = c+d;
		System.out.println(result);

	}

}
