package com.koreait.ex;

import java.util.Scanner;

public class StudentManager {
		
	Student[] arr;
	int idx;
	double avg;
	Scanner scanner = new Scanner(System.in);
	
	StudentManager(int numOfStudents) {
		arr = new Student[numOfStudents];
		for(int i = 0 ; i<arr.length; i++) {
			arr[i] = new Student();
		}
	}
	
	Student input() {
		System.out.print("�л� ���� >> ");
		String name = scanner.nextLine();
		System.out.print("�л� �а� >> ");
		String dept = scanner.nextLine();
		System.out.print("����1 �Է� >> ");
		String score1 = scanner.nextLine();
		System.out.print("����2 �Է� >> ");
		String score2 = scanner.nextLine();
		return new Student(name, dept, score1, score2);
	}
	void addNewStudent(Student student) {
		arr[idx++] = student;
		
	}
	void outputAllStudents() {
		for(int i = 0 ; i< idx; i++) {
			System.out.println((i+1) + "��° �л� ���� ----------");
			arr[i].output();
		}
		System.out.println("================================================");
		System.out.println("�� ��������� : " + outputAverage());
	}
	double outputAverage() {
		for(int i = 0 ; i< idx; i++) {
			avg += arr[i].average/idx;
		}
		return avg;
		
	}
	Student findStudent() {
		System.out.println("ã�� �л��� �Է� >> ");
		String name = scanner.nextLine();
		for(int i=0; i< idx; i++) {
			if(name.equals(arr[i].name)) {
				return arr[i];
			}
		}
		return null;
	}
	void output(Student student) {
		if(student != null) {
			student.output();
		}else {
			System.out.println("ã�� �л� ����.");
		}
	}
}



