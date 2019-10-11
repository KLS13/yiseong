package com.koreait.test;

public class Day {
	
	// Field
	String schedule;
	
	// Constructor
	Day() { }
	
	// Method
	String getSchedule() {
		return schedule;
	}
	void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	void output() {
		if (schedule == null) {
			System.out.println("¾øÀ½");
		} else {
			System.out.println(schedule);
		}
	}

}
