package com.koreait.test2;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		int chance=0;
		int answer = 55;
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
		System.out.print("������ �Է��ϼ��� >> ");
		int num1 = input.nextInt();
		if(num1 > answer) {
			chance++;
			System.out.println("Down!");
		}else if(num1 < answer) {
			chance++;
			System.out.println("Up!");
		}else if(num1 == answer) {
			chance++;
			System.out.println("Answer !");
			System.out.println(chance + "���� �Է��Ͽ����ϴ�.");
			break;
		}
			
		}

	}

}
