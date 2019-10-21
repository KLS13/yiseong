package com.koreait.ex;

import java.util.Calendar;

public class Ex08_Calendar {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		cal.set(2019, 9, 21); // ����  0 ~ 11 �� �ϱ⶧���� 10���� 9 �� ����.
		System.out.println("�� : " + cal.get(Calendar.YEAR) + "��");
		System.out.println("�� : " + cal.get(Calendar.MONTH)+1 + "��");  // ��  0 ~ 11 �� �ϱ⶧����  +1
		System.out.println("�� : " + cal.get(Calendar.DATE) + "��");
		System.out.println("���� : " +cal.get(Calendar.DAY_OF_WEEK)); //�Ͽ���(1) , ������(2) 
		System.out.println("����/���� : " + cal.get(Calendar.AM_PM)); // ���� 0 , ���� 1
		System.out.println("�� : " + cal.get(Calendar.HOUR));
		System.out.println("�� : " + cal.get(Calendar.HOUR_OF_DAY));
		System.out.println("�� : " + cal.get(Calendar.MINUTE));
		System.out.println("�� : " + cal.get(Calendar.SECOND));
		System.out.println("�и��� : " + cal.get(Calendar.MILLISECOND));
		System.out.println("�и��� -> �� : " + cal.get(Calendar.MILLISECOND) / 1000.0 + "��");
		
		// ���� ��¥�� �и��ʷ� ��ȯ
		System.out.println(cal.getTimeInMillis());
	}

}
