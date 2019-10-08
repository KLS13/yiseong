package com.koreait.test;

public class SingerSongMain {

	public static void main(String[] args) {
		
		Song popSong = new Song("Hello","UK");
		Singer singer = new Singer("adele");
		
		singer.setSong(popSong);
		
		singer.output();
	
	}

}
