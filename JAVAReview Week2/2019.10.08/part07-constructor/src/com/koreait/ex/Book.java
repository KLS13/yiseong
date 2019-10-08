package com.koreait.ex;

public class Book {

	// Field
	String title;
	String writer;
	int price;
	int salesVolume;		// 판매량
	boolean isBestSeller;	// 판매량이 1000 이상이면 true, 아니면 false
	
	// Constructor
	Book() {}
	Book(String _title, int _price) {
		title = _title;
		writer = "작가미상";
		price = _price;
	}
	Book(String _title, String _writer, int _price) {
		title = _title;
		writer = _writer;
		price = _price;
	}
	
	// Method
	void setSalesVolume(int sales) {
		salesVolume = sales;
		isBestSeller = sales >= 1000 ? true : false;
	}
	void output() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println("판매량 : " + salesVolume);
		System.out.println(isBestSeller ? "베스트셀러" : "일반서적");
	}
	
}
