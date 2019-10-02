package com.koreait.test;

import java.util.Scanner;

/*권한을 출력하기
3수준 : 실행, 쓰기, 읽기
2수준 : 쓰기, 읽기
1수준 : 읽기
실행 예)
수준 입력 >> 3
실행, 쓰기, 읽기
*/

public class Test08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("1. 읽기 //  2. 쓰기,읽기 // 3. 실행,쓰기,읽기  >>");
		int num = input.nextInt();
		/*
		switch(num) {
		case 1 :
			System.out.println("읽기");
			break;
		case 2 :
			System.out.println("쓰기, 읽기");
			break;
		case 3 :
			System.out.println("실행, 쓰기, 읽기");
			break;
		default :
			System.out.println("오류");
			
		}
		*/
		
		switch(num) {
		case 3 : System.out.print("실행, ");
		case 2 : System.out.print("쓰기, ");
		case 1 : System.out.println("읽기 ");
				break;
		default :
			System.out.println("오류");
		}

	}

}
