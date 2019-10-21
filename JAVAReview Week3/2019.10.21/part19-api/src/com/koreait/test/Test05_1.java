package com.koreait.test;

import java.util.Scanner;

public class Test05_1 {
	
	// Field
	static Scanner scanner = new Scanner(System.in);

	// Method
	static String inputName() {
		
		StringBuffer sb = new StringBuffer();
		
		System.out.print("이름(lastName) >> ");
		String lastName = scanner.nextLine();
		System.out.print("성(firstName) >> ");
		String firstName = scanner.nextLine();
		
		sb.append(lastName).append(" ").append(firstName);
		
		return sb.toString();  // StringBuffer --> String
		
	}

	public static void main(String[] args) {

		// 다른 메소드 호출하려면
		// 다른 메소드는 모두 static 처리를 해야 호출이 가능하다.
		// static 메소드는 static 메소드만 호출할 수 있으므로!
		
		String fullName1 = inputName();
		String fullName2 = inputName();
		
		System.out.println("성명1 : " + fullName1);
		System.out.println("성명2 : " + fullName2);
		
		System.out.println(fullName1.equals(fullName2) ? "같은 이름" : "다른 이름");
		
		scanner.close();
		
	}

}













