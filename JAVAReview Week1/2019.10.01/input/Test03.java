package com.koreait.ex;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//매출액과 등급  vip 일반을 입력받아  등급 vip면 20%할인,  일반이면 5%할인
		Scanner input = new Scanner(System.in);
		

		System.out.print("매출 입력  >> ");
		int num = input.nextInt();
		System.out.print("등급 입력  >> ");
		String grade = input.next();
		
		
		double result = (grade.equals("VIP") ? num*0.8 : num*0.95); 
		System.out.println("할인된 금액은" + result);
	}

}
