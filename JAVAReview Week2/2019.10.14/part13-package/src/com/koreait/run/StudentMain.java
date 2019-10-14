package com.koreait.run;

import com.koreait.control.StudentManager;

public class StudentMain {

	public static void main(String[] args) {

		StudentManager manager = new StudentManager(3);
		
		// Student student = manager.input();
		// manager.addNewStudent(student);
		
		manager.addNewStudent(manager.input());
		manager.addNewStudent(manager.input());
		manager.addNewStudent(manager.input());
		
		manager.outputAllStudents();
		
		manager.outputAverage();
		
		manager.output(manager.findStudent());
		
	}

}
