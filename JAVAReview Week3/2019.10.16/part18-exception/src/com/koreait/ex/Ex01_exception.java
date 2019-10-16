package com.koreait.ex;

import java.util.Scanner;

public class Ex01_exception {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int num1, num2 ;
		try {
		System.out.print("Á¤¼ö1 ÀÔ·Â >> ");
		num1 = scanner.nextInt();
		System.out.print("Á¤¼ö2 ÀÔ·Â >> ");
		num2 = scanner.nextInt();

		System.out.println("µ¡¼À : " + (num1+num2));
		System.out.println("»¬¼À : " + (num1-num2));
		System.out.println("°ö¼À : " + (num1*num2));
		System.out.println("³ª´°¼À : " + (num1/num2));
		}catch(Exception e) {
			System.out.println("0 À¸·Î ³ª´­ ¼ö ¾ø½À´Ï´Ù.");
		}finally {
			if( scanner != null) { scanner.close(); }
		}
	}

	
}
