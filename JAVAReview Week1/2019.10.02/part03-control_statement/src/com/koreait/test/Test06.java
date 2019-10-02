//알파벳 하나 입력 --> 대문자는 소문자로, 소문자는 대문자로, 나머지는 그대로
package com.koreait.test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int str = input.nextLine().charAt(0);
		
		if(str >= 65 && str <=90) {
			System.out.println((char)(str+32));
		}else if(str >=91 && str <=122) {
			System.out.println((char)(str-32));
		}else {
			System.out.println((char)str);
		}
		input.close();

	
		
}
}
