package com.koreait.test;

public class SongSingerMain {

	public static void main(String[] args) {
		Singer singer = new Singer("������", 3);
		
		singer.setSong(new Song("�����","�ѱ�"));
		singer.setSong(new Song("����","�ѱ�"));
		singer.setSong(new Song("������","�ѱ�"));
		
		singer.output();

	}

}
