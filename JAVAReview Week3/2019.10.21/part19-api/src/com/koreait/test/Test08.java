package com.koreait.test;

import java.util.Calendar;

public class Test08 {

	public static void main(String[] args) {

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		// date1 을 기념일로 수정
		date1.set(1994, 03, 29, 3, 25);
		
		// 밀리초 단위로 계산하려면 int 말고 long 사용
		long elapseMilliSecond = date2.getTimeInMillis() - date1.getTimeInMillis();
		
		// 1000 밀리초 = 1초
		long elapseSecond = elapseMilliSecond / 1000;
		 
		// 60초 = 1분, 60분 = 1시간, 24시간 = 1일
		long elapseDay = elapseSecond / (60 * 60 * 24);
		
		System.out.println("경과한 일수는 " + elapseDay + "일 입니다.");
		
	}

}
