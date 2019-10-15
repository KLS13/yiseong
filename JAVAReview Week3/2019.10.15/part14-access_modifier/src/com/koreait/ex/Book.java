package com.koreait.ex;

public class Book {

	// Field
	private String title;
	private String writer;
	private int price;
	private int salesVolume;		// �Ǹŷ�
	private boolean isBestSeller;	// �Ǹŷ��� 1000 �̻��̸� true, �ƴϸ� false
	
	// Constructor
	
	public Book() {
	}
	public Book(String title, String writer, int price) {
		
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	public Book(String title, int price) {
		this(title,"���ڹ̻�",price);
	}
// Method
	
	
	void output() {
		System.out.println("���� : " + title);
		System.out.println("���� : " + writer);
		System.out.println("���� : " + price);
		System.out.println("�Ǹŷ� : " + salesVolume);
		System.out.println(isBestSeller ? "����Ʈ����" : "�Ϲݼ���");
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
	

