package com.koreait.test;

class Student {
	
	// Field
	private String no; 
	private String name;
	private int[] scores;
	private double average;
	private char grade;
	public final static int COURSE_COUNT = 3;	// 과목 수
												// 누구든, 어디서든 Student.COURSE_COUNT 로 확인 가능!
	
	// Constructor
	public Student(String no, String name) {
		this.no = no;
		this.name = name;
		scores = new int[COURSE_COUNT];
	}
	
	// Method
	public void setScores(int kor, int eng, int mat) {
		scores[0] = kor;
		scores[1] = eng;
		scores[2] = mat;
		setAverage();	// 평균을 자동계산하라!
		setGrade();		// 학점을 자동계산하라!
	}
	
	public void setScores(int [] scores) {
		for (int i=0 ; i<COURSE_COUNT; i++) {
			this.scores[i] = scores[i];
		}
		setAverage();	// 평균을 자동계산하라!
		setGrade();		// 학점을 자동계산하라!
	}
	
	private void setAverage() {
		// average = (scores[0] + scores[1] + scores[2]) / 3.0;
		int total = 0;
		for (int i = 0; i < COURSE_COUNT; i++) {
			total += scores[i];
		}
		average = (double)total / COURSE_COUNT;
	}
	
	private void setGrade() {
		switch ((int)average / 10) {
		case 10:
		case 9:	grade = 'A';	break;
		case 8: grade = 'B';	break;
		case 7: grade = 'C';	break;
		case 6: grade = 'D';	break;
		default: grade = 'F';
		}
	}
	
	@Override
	public String toString() {
		return "학번 : " + no + ", 성명 : " + name + ", 평균 : " + average + ", 학점 : " + grade;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj != null && obj instanceof Student) {
			Student other = (Student) obj;
			return no.equals(other.no);
		} else {
			return false;
		}
	}
	
}
/*
public class Test04 {

	public static void main(String[] args) {

		Student student1 = new Student("9711117", "alice");
		Student student2 = new Student("9711117", "alice");
		
		student1.setScores(70, 80, 88);
		student2.setScores(75, 83, 85);
		
		System.out.println(student1);
		System.out.println(student2);
		
		if (student1.equals(student2)) {
			System.out.println("같은 학생!");
		} else {
			System.out.println("다른 학생!");
		}
		
	}

}
*/

public class Test04 {

	public static void main(String[] args) {

		Student student1 = new Student("9711117", "alice");
		Student student2 = new Student("9711117", "alice");
		
		int[] mid = new int[Student.COURSE_COUNT];
		for (int i = 0; i < Student.COURSE_COUNT; i++) {
			mid[i] = (int)(Math.random() * 101);
		}
		student1.setScores(mid);
		student2.setScores(75, 83, 85);
		
		System.out.println(student1);
		System.out.println(student2);
		
		if (student1.equals(student2)) {
			System.out.println("같은 학생!");
		} else {
			System.out.println("다른 학생!");
		}
		
	}

}
