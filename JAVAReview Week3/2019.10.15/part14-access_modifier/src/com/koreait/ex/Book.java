package com.koreait.ex;

public class Book {

	// Field
	private String title;
	private String writer;
	private int price;
	private int salesVolume;		// 판매량
	private boolean isBestSeller;	// 판매량이 1000 이상이면 true, 아니면 false
	
	// Constructor
	
	public Book() {
	}
	public Book(String title, String writer, int price) {
		
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	public Book(String title, int price) {
		this(title,"작자미상",price);
	}
// Method
	
	
	void output() {
		System.out.println("제목 : " + title);
		System.out.println("저자 : " + writer);
		System.out.println("가격 : " + price);
		System.out.println("판매량 : " + salesVolume);
		System.out.println(isBestSeller ? "베스트셀러" : "일반서적");
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSalesVolume() {
		return salesVolume;
	}
	public void setSalesVolume(int salesVolume) {
		if(salesVolume >= 1500) {
			isBestSeller = true;
		}
		this.salesVolume = salesVolume;
	}
	public boolean isBestSeller() {
		
		return isBestSeller;
	}
	public void setBestSeller(boolean isBestSeller) {
		this.isBestSeller = isBestSeller;
	}


	}
	

