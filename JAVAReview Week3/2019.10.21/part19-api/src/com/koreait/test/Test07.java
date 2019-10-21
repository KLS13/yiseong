package com.koreait.test;
import java.util.Calendar;

//현재 날짜를 StringBuffer, Calendar 클래스를 이용하여
//"2019년 10월 21일 월요일 오후 1시 10분" 과 같은 형식으로 완성하고 출력하시오.
public class Test07 {

	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		StringBuffer sb = new StringBuffer();
		
		//요일번호를 인덱스로 사용하자!
		//요일번호   1=일, 2=월, 3=화, 4=수 …… 7 토
		String[] weeks = {" ","일","월","화","수","목","금","토"}; // 인덱스 0 은 요일번호에 없기때문.  
		
		sb.append(now.get(Calendar.YEAR) + "년 ");
		sb.append( (now.get(Calendar.MONTH) + 1) + "월 ");
		sb.append(now.get(Calendar.DAY_OF_MONTH) + "일 ");
		int i = now.get(Calendar.DAY_OF_WEEK);
		sb.append(weeks[i] + "요일 ");
		sb.append( now.get(Calendar.AM_PM) == 0 ? "오전 " : "오후 ");
		sb.append(now.get(Calendar.HOUR) + "시 ");
		sb.append(now.get(Calendar.MINUTE) + "분");
		
		System.out.println(sb.toString());
		
		
		
	

	}

}
