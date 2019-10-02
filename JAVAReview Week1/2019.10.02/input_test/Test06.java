package com.koreait.ex;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("주민번호 입력 >> ");
		char num = input.next().charAt(6);
		
		String gender = (num == '1' || num == '3' ) ? "남자" : "여자";
		
		System.out.println("성별이 " + gender + " 입니다.");

		input.close();
		
	}

}
