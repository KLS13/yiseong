package com.koreait.ex;

public class BookMain {

	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book("ƒ·¡„∆œ¡„", 10000);
		Book book3 = new Book("µµ¿¸ ¿⁄πŸ 200πÆ¡¶", "±Ë¿⁄πŸ", 30000);
		
		book1.setSalesVolume(0);
		book2.setSalesVolume(500);
		book3.setSalesVolume(1500);
		
		book1.output();		
		System.out.println("----------------------");
		book2.output();		
		System.out.println("----------------------");
		book3.output();
		
	}

}
