package com.koreait.ex;
import java.util.*;
public class Ex01_scanner {

	public static void main(String[] args) {
		/*
		 * 1. Scanner 클래스
		 * 
		 * 	1) 콘솔 창을 통한 입력
		 * 	2) java.util.Scanner 클래스로 존재
		 * 		1) java.util.Scanner 로 그대로 사용
		 * 		2) import 후 사용
		 * 			- import 대상 : java.lang 이외의 모든 클래스
		 * 	3) Scanner 클래스의 객체 생성 방법
		 * 		Scanner 객체명 = new Scanner(입력스트림);
		 * 	4) Scanner 클래스의 객체 소멸 방법
		 * 		객체명.close();
		 * 	5) Scanner 클래스의 메소드
		 * 		(1) 문자열 입력
		 * 			- next() : 공백 전까지 입력
		 * 			- nextLine() : 엔터 전까지 입력
		 * 		(2) 정수 입력
		 * 			- nextInt(), nextByte(), nextShort(), nextLong()
		 * 		(3) 실수 입력
		 * 			- nextDouble(), nextFloat()
		 * 		(4) 논리 입력
		 * 			- nextBoolean()
		 * 		(5) 문자 입력
		 * 			- 문자열 입력(next(), nextLine()) 받은 뒤 첫 번째 값(charAt(0))만 사용
		 */
		
		// 성명, 나이, 키, 성별 입력 받아 출력하기
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("성명 입력 >> ");
		String name = scanner.nextLine();
		System.out.print("나이 입력 >> ");
		int age = scanner.nextInt();
		System.out.print("신장 입력 >> ");
		double height = scanner.nextDouble();
		System.out.print("성별 입력 >> ");
		char gender = scanner.next().charAt(0);
		
		System.out.println("이름 : " + name + ", 나이 : " + age + ", 신장 : " + height + ", 성별 : " + gender);
		
		// scanner 객체 소멸
		scanner.close();
		
		}

}
