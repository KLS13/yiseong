package com.koreait.test;

import java.util.Calendar;

public class Test08 {

	public static void main(String[] args) {

		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		// date1 �� ����Ϸ� ����
		date1.set(1994, 03, 29, 3, 25);
		
		// �и��� ������ ����Ϸ��� int ���� long ���
		long elapseMilliSecond = date2.getTimeInMillis() - date1.getTimeInMillis();
		
		// 1000 �и��� = 1��
		long elapseSecond = elapseMilliSecond / 1000;
		 
		// 60�� = 1��, 60�� = 1�ð�, 24�ð� = 1��
		long elapseDay = elapseSecond / (60 * 60 * 24);
		
		System.out.println("����� �ϼ��� " + elapseDay + "�� �Դϴ�.");
		
	}

}
