package com.koreait.ex;
//������ �����ϴ� ���
public class Local {
	String name;
	int age;
	String jumin;
	boolean isKorean; // �ѱ��� true;
	
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
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ֹε�Ϲ�ȣ : " + jumin == null? "����" : jumin);
		System.out.println(isKorean ? "�ѱ���" : "�ܱ���");
	}

}
