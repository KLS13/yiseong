package com.koreait.ex;

public class StudentMain {

	public static void main(String[] args) {
		StudentManager manager = new StudentManager(3);
	
		/*
		Student student1 = manager.input();
		manager.addNewStudent(student1);
		*/
		
		manager.addNewStudent(manager.input());
		manager.addNewStudent(manager.input());
		manager.addNewStudent(manager.input());
		
		manager.outputAllStudents();
		
		manager.outputAverage();
		manager.output(manager.findStudent());
	}

}
