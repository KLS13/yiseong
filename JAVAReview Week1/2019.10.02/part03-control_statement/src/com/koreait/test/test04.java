//점수를 직접 입력받아 학점 출력하기 : 100~97 a+   96~94 a  93~90 a-
//                           89~87B+     86~84  B  83~80 B-
//                           79~77      76~74       73~70   69이하  F
package com.koreait.test;
import java.util.Scanner;

public class test04 {

	public static void main(String[] args) {
		String grade= "";
		Scanner input = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int score = input.nextInt();
		
		if(score>=90) {
			grade = "A";
		}else if(score>=80) {
			grade = "B";
		}else if(score>=70) {
			grade = "C";
		}else {
			grade = "F";
		}
		if(score==100 || (score%10>7 && score >=70)) {
			System.out.println(grade+"+");
		}else if(score%10>=4 && score >=70) {
			System.out.println(grade);
		}else if(score%10>=0 && score >=70) {
			System.out.println(grade+"-");
		}else {
			System.out.println(grade);
		}
	}
}
