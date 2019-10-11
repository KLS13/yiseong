package com.koreait.test;

public class SongSingerMain {

	public static void main(String[] args) {
		Singer singer = new Singer("나가수", 3);
		
		singer.setSong(new Song("사랑해","한국"));
		singer.setSong(new Song("고마워","한국"));
		singer.setSong(new Song("감사해","한국"));
		
		singer.output();

	}

}
