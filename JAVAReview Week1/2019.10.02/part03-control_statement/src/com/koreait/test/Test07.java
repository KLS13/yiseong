//
package com.koreait.test;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("¼·¾¾ ÀÎÁö È­¾¾ÀÎÁö ÀÔ·Â >> ");
		String str = input.next();
		System.out.print("¿Âµµ¸¦ ÀÔ·Â >> ");
		double num = input.nextDouble();
		
		switch(str) {
		case "¼·¾¾" :
			num = (num*1.8)+32;
			System.out.println(str + "¿¡¼­" + " È­¾¾"+ num+ " ·Î º¯°æµÇ¾ú½À´Ï´Ù.");
			break;
		case "È­¾¾" :
			num = (num-32)/1.8;
			System.out.println(str + "¿¡¼­" + " ¼·¾¾" + num+ " ·Î º¯°æµÇ¾ú½À´Ï´Ù.");
			break;
			default :
				System.out.println("¿À·ù");
		}
	
	}

}
