package com.koreait.ex;
//국내에 거주하는 사람
public class Local {
	String name;
	int age;
	String jumin;
	boolean isKorean; // 한국은 true;
	
	void setLocalInfo(String name, int age, String jumin) {
	
	/*	this.name = name;
		this.age = age;  */
		setLocalInfo(name, age);
		this.jumin = jumin;
		isKorean = jumin.charAt(7) <= '4' ? true : false;
	}
	void setLocalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주민등록번호 : " + jumin == null? "없음" : jumin);
		System.out.println(isKorean ? "한국인" : "외국인");
	}

}
