package com.koreait.ex;
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		
		System.out.print("나이 입력 : ");
		age = input.nextInt();
		
		String message = (age >= 20) ? "성인" : "미성년자";
		System.out.println(message);
		
		input.close();
	}

}
