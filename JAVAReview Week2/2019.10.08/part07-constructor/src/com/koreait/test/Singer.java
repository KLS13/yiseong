package com.koreait.test;

public class Singer {
	String name;
	Song song;
	
	Singer(String _name){
		name = _name;
	}
	void setSong(Song s) {
		song = s;
	}
	void output() {
		System.out.println("���� �̸� : " + name);
		song.output();
	}
}
	
