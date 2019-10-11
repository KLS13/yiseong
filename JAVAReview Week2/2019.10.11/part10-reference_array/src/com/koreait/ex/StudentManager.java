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
		System.out.print("학생 성명 >> ");
		String name = scanner.nextLine();
		System.out.print("학생 학과 >> ");
		String dept = scanner.nextLine();
		System.out.print("점수1 입력 >> ");
		String score1 = scanner.nextLine();
		System.out.print("점수2 입력 >> ");
		String score2 = scanner.nextLine();
		return new Student(name, dept, score1, score2);
	}
	void addNewStudent(Student student) {
		arr[idx++] = student;
		
	}
	void outputAllStudents() {
		for(int i = 0 ; i< idx; i++) {
			System.out.println((i+1) + "번째 학생 정보 ----------");
			arr[i].output();
		}
		System.out.println("================================================");
		System.out.println("총 평균점수는 : " + outputAverage());
	}
	double outputAverage() {
		for(int i = 0 ; i< idx; i++) {
			avg += arr[i].average/idx;
		}
		return avg;
		
	}
	Student findStudent() {
		System.out.println("찾을 학생의 입력 >> ");
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
			System.out.println("찾는 학생 없음.");
		}
	}
}



