package com.koreait.test;

public class Student {
	String name;
	String dept;
	Grade grade;
	

	Student(String _name, String _dept, Grade _grade) {
		name = _name;
		dept = _dept;
		grade = _grade;
	}
	void output() {
		System.out.println("�̸��� "+name + ", �й��� " + dept);
		System.out.println("�л��� ���" + grade.average + "�л��� ����" + grade.grade);  // ������ ��� ���� ���� ������ ����
		System.out.println("�л��� ���" + grade.getAverage() + "�л��� ����" + grade.getGrade()); //�޼ҵ�� ȣ���ؾ��ϴ°� ���� !

	}

}
