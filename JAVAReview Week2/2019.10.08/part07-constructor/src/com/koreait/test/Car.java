package com.koreait.test;

import java.util.Calendar;

public class Car {
	String model;
	String color;
	int year;
	boolean isNewCar;
		
	Car(String _color, int _year) {
		Calendar calendar = Calendar.getInstance();
		model = "모델명 미지정";
		color = _color;
		year = _year;
		isNewCar = calendar.get(calendar.YEAR)==year ? true : false;
	}
	Car(String _model,String _color, int _year){
		Calendar calendar = Calendar.getInstance();
		model = _model;
		color = _color;
		year = _year;
		isNewCar = calendar.get(calendar.YEAR)==year ? true : false;
		
	}
	
	void output(){
		Calendar calendar = Calendar.getInstance();
		System.out.println("모델명 : " + model + "색상 : " + color);
		System.out.println(isNewCar ? "올해의 신차" : "중고차");
	}

}
