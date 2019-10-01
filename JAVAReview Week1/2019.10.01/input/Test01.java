// 두 정수 입력 a b 저장   값 교환
package com.koreait.ex;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("정수 입력 >> ");
		int a = input.nextInt();
		System.out.print("정수 입력 >> ");
		int b = input.nextInt();
		
		System.out.println("a값 : " + a + ", b값 : " + b);
		
		int temp = a;
		a = b;
		b= temp;
		
		System.out.println("a값 : " + a + ", b값 : " + b);

	}

}
