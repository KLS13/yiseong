package com.koreait.ex;

import java.util.Calendar;

public class Ex08_Calendar {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 9, 21); // 월은  0 ~ 11 로 하기때문에 10월은 9 가 맞음.
		System.out.println("년 : " + cal.get(Calendar.YEAR) + "년");
		System.out.println("월 : " + cal.get(Calendar.MONTH)+1 + "월");  // 은  0 ~ 11 로 하기때문에  +1
		System.out.println("일 : " + cal.get(Calendar.DATE) + "일");
		System.out.println("요일 : " +cal.get(Calendar.DAY_OF_WEEK)); //일요일(1) , 월요일(2) 
		System.out.println("오전/오후 : " + cal.get(Calendar.AM_PM)); // 오전 0 , 오후 1
		System.out.println("시 : " + cal.get(Calendar.HOUR));
		System.out.println("시 : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("분 : " + cal.get(Calendar.MINUTE));
		System.out.println("초 : " + cal.get(Calendar.SECOND));
		System.out.println("밀리초 : " + cal.get(Calendar.MILLISECOND));
		System.out.println("밀리초 -> 초 : " + cal.get(Calendar.MILLISECOND) / 1000.0 + "초");
		
		// 현재 날짜를 밀리초로 반환
		System.out.println(cal.getTimeInMillis());
	}

}
