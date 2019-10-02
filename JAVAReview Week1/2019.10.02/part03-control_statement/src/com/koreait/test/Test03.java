////나이를 입력 받아 7 이하 --> 미취학,  13이하 --> 초딩  16이하--> 중딩  19 이하 고딩  나머지 성인
package com.koreait.test;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = input.nextInt();
		
		if(age <= 7) {
			System.out.println("미취학");
		}else if(age <= 13) {
			System.out.println("초딩");
		}else if(age <=16) {
			System.out.println("중딩");
		}else if(age <=19) {
			System.out.println("고딩");
		}else {
			System.out.println("성인");
		}

	}

}
