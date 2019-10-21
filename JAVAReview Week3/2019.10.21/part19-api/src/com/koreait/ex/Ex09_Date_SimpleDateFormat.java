package com.koreait.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_Date_SimpleDateFormat {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		
		//SimpleDateFormat
		//년 : yy, yyyy
		//월 : M, MM
		//일 : d, dd
		//요일 : E
		//오전오후 : a
		//시 : hh(12시각) , HH(24시각)
		//분 : mm
		//초 : ss
		
		//2019년 10월 21일 월요일
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a hh시 mm분 ss초 E요일");
		String today = sdf.format(now);
		
		System.out.println(today);
		

	}

}
