package com.koreait.ex;

public class BookMain {

	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book("ÄáÁãÆÏÁã", 10000);
		Book book3 = new Book("µµÀü ÀÚ¹Ù 200¹®Á¦", "±èÀÚ¹Ù", 30000);
		
		book1.setSalesVolume(0);
		book2.setSalesVolume(500);
		book3.setSalesVolume(1500);
		
		book1.output();		System.out.println("-----");
		book2.output();		System.out.println("-----");
		book3.output();
		
	}

}
