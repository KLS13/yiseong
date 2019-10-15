package com.koreait.ex;
public class Local {

	// Field
	private String name;
	private int age;
	private String sn;
	private boolean isKorean;
	
	// Constructor
	public Local(String name, int age) {
		this(name, age, null);
	}
	public Local(String name, int age, String sn) {
		this.name = name;
		this.age = age;
		this.sn = sn;
		if (sn != null) {
			this.isKorean = sn.charAt(7) <= '4' ? true : false;
		}
	}
	
	// Method
	public void output() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ֹε�Ϲ�ȣ : " + (sn == null ? "����" : sn));
		System.out.println(isKorean ? "�ѱ���" : "�ܱ���");
	}
	
}
