package com.koreait.ex;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_Calendar_Date_SimpleDateFormat {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		Date now = cal.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초");
		String today = sdf.format(now);
		System.out.println(today);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yy년 hh시 mm분");
		String today2 = sdf2.format(now);
		System.out.println(today2);
	}

}
