package com.koreait.ex;
/*
 클래스(class)
  1. 객체지향언어에서 "객체"를 만드는 도구이다.
  2. "객체"를 만드는 설계도이다.
  3. "객체(object)", "인스턴스(instance)"
  4. 개념 비교 예시
          클래스         		 객체(인스턴스)
           사람	     	 철수,영희,미희 등
           붕어빵 만드는 기계    붕어빵
  5.
         변수 => 필드
         함수 => 메소드
 */
public class Book {
	String title;
	String writer;
	int price;
	boolean isBestSeller;
	
	void info() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println(isBestSeller ? "베스트셀러" : "일반 서적");
	}
}
