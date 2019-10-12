package com.koreait.test;

import java.util.Scanner;

//UP-DOWN 게임
//0~100 사이 난수가 발생된다.
//발생한 난수를 맞춘다
//몇번만에 맞췄는지 출력하고 프로그램 종료
public class Test01 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*101);
		int count = 0 ;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.print("정수 입력 >> ");
		int input = scanner.nextInt();
		count ++;
		if(num == input) {
			System.out.println("정답입니다." + count + "번 만에 성공");
			break;
		}
		if(num > input) {
			System.out.println("UP");
		}
		if(num < input) {
			System.out.println("Down");
		}
			
		}
		
		scanner.close();
		
		
	}

}
