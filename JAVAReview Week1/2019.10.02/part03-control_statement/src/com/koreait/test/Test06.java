//���ĺ� �ϳ� �Է� --> �빮�ڴ� �ҹ��ڷ�, �ҹ��ڴ� �빮�ڷ�, �������� �״��
package com.koreait.test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�Է� : ");
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
