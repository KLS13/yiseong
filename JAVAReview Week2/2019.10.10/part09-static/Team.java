package com.koreait.ex;

public class Team {

	String name;
	static int count;
	
	Team(String name) {
		this.name = name;
		count++;
	}
	
	void output() {
		System.out.println("ÀÌ¸§  : " + name  );
		System.out.println("ÆÀ¿ø : " + count+"¸í");
	}
}
