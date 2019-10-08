package com.koreait.test;

public class Song {
	String title;
	String country;

	Song(String _title, String _country) {
		title = _title;
		country = _country;
	}
	
	void output() {
		System.out.println("노래제목 : " + title);
		System.out.println("노래국가 : " + country);
	}
	
}
