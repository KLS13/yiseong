package com.koreait.ex;

public class Team {

	String name;
	static int count;
	
	Team(String name) {
		this.name = name;
		count++;
	}
	
	void output() {
		System.out.println("�̸�  : " + name  );
		System.out.println("���� : " + count+"��");
	}
}
