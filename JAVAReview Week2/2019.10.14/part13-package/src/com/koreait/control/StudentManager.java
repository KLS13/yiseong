package com.koreait.control;

import java.util.Scanner;
import com.koreait.data.Student;

public class StudentManager {

	// Field
	Student[] arr;
	int idx;
	Scanner scanner = new Scanner(System.in);
	
	// Constructor
	public StudentManager(int numOfStudents) {
		arr = new Student[numOfStudents];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Student();
		}
	}
	
	// Method
	public Student input() {
		System.out.print("�л� ���� >> ");
		String name = scanner.nextLine();
		System.out.print("�л� �а� >> ");
		String dept = scanner.nextLine();
		System.out.print("�߰� ���� >> ");
		String score1 = scanner.nextLine();
		System.out.print("�⸻ ���� >> ");
		String score2 = scanner.nextLine();
		return new Student(name, dept, score1, score2);
	}
	public void addNewStudent(Student student) {
		arr[idx++] = student;
	}
	public void outputAllStudents() {
		for (int i = 0; i < idx; i++) {
			System.out.println((i + 1) + "��° �л� ���� -----");
			arr[i].output();
		}
	}
	public void outputAverage() {
		double total = 0;
		for (int i = 0; i < idx; i++) {
			total += arr[i].getAverage();
		}
		System.out.println("��ü ��� : " + (total / idx));
	}
	public Student findStudent() {
		System.out.print("ã�� �л��� �̸� �Է� >> ");
		String name = scanner.nextLine();
		for (int i = 0; i < idx; i++) {
			if (name.equals(arr[i].name)) {
				return arr[i];
			}
		}
		return null;
	}
	public void output(Student student) {
		if (student != null) {
			student.output();
		} else {
			System.out.println("ã�� �л��� �����ϴ�.");
		}
	}
	
}
