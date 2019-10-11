package com.koreait.test;

public class Singer {

	String name;
	Song[] songList;
	int idx;
	
	Singer() { }
	Singer(String name, int songCount) {
		this.name = name;
		if(songCount >= 1) {
			songList = new Song[songCount];
		}
	}
	void setSong(Song song) {
		songList[idx++] = song;
	}
	void output() {
		System.out.println("가수 이름 : " + name);
		System.out.println("대표곡 모음 ------------");
		for( Song song : songList) {
			song.output();
		}
	}
}
