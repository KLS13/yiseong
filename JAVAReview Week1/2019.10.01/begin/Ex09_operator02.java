package com.koreait.ex;

public class Ex09_operator02 {

	public static void main(String[] args) {
		/*
		 증감 연산자
		  a++ : a를 사용하고 증가
		  ++a : a를 증가하고 사용
		  a-- : a를 사용하고 감소
		  --a : a를 감소하고 사용
		  
		  시프트 연산자
		   왼쪽 시프트
		   - <<
		   - 왼쪽으로 한자리씩 밀어낸다.
		   - 비트 연산
		   - 2를 곱하는 효과가 있다.
		   오른쪽 시프트
		   - >>
		   - 오른쪽으로 한 자리씩 밀어낸다.
		   - 비트 연산
		   - 2로 나누는 효과가 있다.
		 */

		int num = 8;
		System.out.println("왼쪽 시프트 : " + (num<<1));
		System.out.println("오른쪽 시프트 : " + (num>>1));
	}

	

}
