package com.koreait.ex;
// 객체 생성(인스턴스 생성)
// 정의된 클래스를 이용하여 "객체"를 생성한다.
// 생성 방법
// 클래스명 객체명 = new 클래스명();
// 객체(인스턴스) 사용 방법
	//객체명.필드명
	//객체명.메소드명
/*
 메인 클래스
 	1. 메인 메소드를 가지고 있는 클래스이다.
 	2. 프로그램이 시작되는 클래스이다.
 	3. 프로그램의 이름이 되는 클래스이다.
*/
public class BookMain {

	public static void main(String[] args) {
		//1. Book 객체(인스턴스) 생성
		
		Book myBook = new Book();
		
		//생성된 객체 (myBook) 활용
		myBook.title = "자바의 정석";
		myBook.writer = "남궁성";
		myBook.price = 35000;
		myBook.isBestSeller = true;
		
		myBook.info();
	}

}
