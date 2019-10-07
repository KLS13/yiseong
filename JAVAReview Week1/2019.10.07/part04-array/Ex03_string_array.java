package com.koreait.ex;
import java.util.Scanner;

public class Ex03_string_array {

	public static void main(String[] args) {
		/*
		 string 배열
		 	문자열을 여러 개 저장하기 위해서 사용
		 	일반적으로 한 번 문자열이 저장되면 수정될 일이 없다.
		 	수정될 일이 없다면 for-each문을 활용
		 */
		Scanner input = new Scanner(System.in);
		String [] names = new String[3];
		int j=0;
		
		for(int i = 0; i<names.length; i++) {
			System.out.print("성명 입력 >> ");
			names[i] = input.nextLine();
		}
		
		for(String str : names) {
			System.out.println("names["+j+"] = " + str);
			j++;
		}
		
		input.close();
		
		String[] friends = new String[] {"alice", "james", "tom"};
		String[] hobbies = {"운동", "독서", "영화"};
		
		for(String friend : friends) {
			System.out.println(friend);
		}
		for(String hobby : hobbies) {
			System.out.println(hobby);
		}
	

	}

}
