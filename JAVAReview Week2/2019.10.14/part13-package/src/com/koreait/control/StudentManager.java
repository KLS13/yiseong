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
		System.out.print("학생 성명 >> ");
		String name = scanner.nextLine();
		System.out.print("학생 학과 >> ");
		String dept = scanner.nextLine();
		System.out.print("중간 점수 >> ");
		String score1 = scanner.nextLine();
		System.out.print("기말 점수 >> ");
		String score2 = scanner.nextLine();
		return new Student(name, dept, score1, score2);
	}
	public void addNewStudent(Student student) {
		arr[idx++] = student;
	}
	public void outputAllStudents() {
		for (int i = 0; i < idx; i++) {
			System.out.println((i + 1) + "번째 학생 정보 -----");
			arr[i].output();
		}
	}
	public void outputAverage() {
		double total = 0;
		for (int i = 0; i < idx; i++) {
			total += arr[i].getAverage();
		}
		System.out.println("전체 평균 : " + (total / idx));
	}
	public Student findStudent() {
		System.out.print("찾을 학생의 이름 입력 >> ");
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
			System.out.println("찾는 학생이 없습니다.");
		}
	}
	
}
