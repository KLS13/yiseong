//정수를 입력 받아 "짝수", "홀수" 구분해서 출력하기  3의 배수는 "3의 배수라고 출력하기"

package com.koreait.test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력 >> ");
		int num = input.nextInt();
		
		if(num%3==0) {
			System.out.println("3의 배수");
		}else if(num%2==0) {
			System.out.println("짝수");
		}else if(num%2>0) {
			System.out.println("홀수");
		}
		input.close();
	}
}