package com.koreait.test;

public class Song {
	String title;
	String country;

	Song(String _title, String _country) {
		title = _title;
		country = _country;
	}
	
	void output() {
		System.out.println("�뷡���� : " + title);
		System.out.println("�뷡���� : " + country);
	}
	
}
