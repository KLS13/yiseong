package com.koreait.test;

public class Song {
	String title;
	String country;
	
	Song() { }
	Song(String title, String country) {
		this.title = title;
		this.country = country;
	}
	
	void output() {
		System.out.println("�뷡 ���� : " + title);
		System.out.println("�뷡 ���� : " + country);
	}

}
