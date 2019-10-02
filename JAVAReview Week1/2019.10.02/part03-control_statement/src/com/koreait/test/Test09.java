/*
월을 입력 받아 일을 출력하기
실행 예)
월 입력 >> 10
10월은 31일까지 있습니다.
 */
package com.koreait.test;
import java.util.Scanner;
public class Test09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("원하는 월을 입력해주세요 >> ");
		int month = input.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: 
		case 7: case 8: case 10:
		case 12:
			System.out.println(month + "월달은 31일까지 있습니다.");
			break;
		case 4: case 6:
		case 9: case 11:
			System.out.println(month + "월달은 30일까지 있습니다.");
			break;
		case 2:
			System.out.println(month + "월달은 28일까지 있으며, 4년마다 윤년으로 29일입니다.");
			break;
		default :
			System.out.println("오류");
		}

	}

}
