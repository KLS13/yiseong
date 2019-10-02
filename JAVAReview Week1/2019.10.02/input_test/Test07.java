package com.koreait.ex;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("¼·¾¾ ÀÎÁö È­¾¾ÀÎÁö ÀÔ·Â >> ");
		String str = input.next();
		System.out.print("¿Âµµ¸¦ ÀÔ·Â >> ");
		double num = input.nextDouble();
		
		double temper = (str.equals("¼·¾¾")) ? (num*1.8)+32 : (num-32)/1.8;
		String result = (str.equals("¼·¾¾")) ? "È­¾¾" : "¼·¾¾";
		System.out.println(str + "¿¡¼­ " + result + "·Î º¯°æµÇ¾ú½À´Ï´Ù >> " + temper);

	}

}
