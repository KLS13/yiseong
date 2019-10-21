package com.koreait.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex09_Date_SimpleDateFormat {

	public static void main(String[] args) {
		
		Date now = new Date();
		System.out.println(now);
		
		//SimpleDateFormat
		//�� : yy, yyyy
		//�� : M, MM
		//�� : d, dd
		//���� : E
		//�������� : a
		//�� : hh(12�ð�) , HH(24�ð�)
		//�� : mm
		//�� : ss
		
		//2019�� 10�� 21�� ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� a hh�� mm�� ss�� E����");
		String today = sdf.format(now);
		
		System.out.println(today);
		

	}

}
