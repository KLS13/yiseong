package com.koreait.test;

public class StudentGradeMain {

	public static void main(String[] args) {
		Grade midTerm = new Grade(88,76,80);
		Student student = new Student("홍길동", "경영학과", midTerm);
		
		student.output();
		
	


	}

}
