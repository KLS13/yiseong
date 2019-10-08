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
		System.out.println("이름은 "+name + ", 학번은 " + dept);
		System.out.println("학생의 평균" + grade.average + "학생의 학점" + grade.grade);  // 앞으로 사용 하지 않을 예정의 형식
		System.out.println("학생의 평균" + grade.getAverage() + "학생의 학점" + grade.getGrade()); //메소드로 호출해야하는게 좋음 !

	}

}
