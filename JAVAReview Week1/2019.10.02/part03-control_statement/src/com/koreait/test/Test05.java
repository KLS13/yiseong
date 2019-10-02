//문자입력  대문자 소문자  숫자  일반문자
package com.koreait.test;
import java.util.*;

public class Test05 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("입력 : ");
			int str = input.nextLine().charAt(0);

			if(str >= 65 && str <=90) {
				System.out.println("대문자 입니다.");
			}else if(str >=91 && str <=122) {
				System.out.println("소문자 입니다.");
			}else if(str>=48 && str <=64){
				System.out.println("숫자 입니다.");
			}else {
				System.out.println("일반 문자 입니다.");
			}
			input.close();
			
		}
}