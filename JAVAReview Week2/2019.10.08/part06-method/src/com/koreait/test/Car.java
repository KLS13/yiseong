package com.koreait.test;

import java.util.Calendar;

public class Car {
	String model;
	String color;
	int year;

	
	void setFields(String _model, String _color, int year) {
		setFields(_model,_color);
		this.year = year;
	
	}
	
	void setFields(String _model, String _color) {
		Calendar calendar = Calendar.getInstance();
		model = _model;
		color = _color;
		year = calendar.get(calendar.YEAR);
	}
	
	void ouput() {
		System.out.println("모델은 " + model + ", 색상은 " + color);
		System.out.println("년식은 " + (year ==2019 ? "올해 나온 신차" : year+"년식"));
		
	}
}