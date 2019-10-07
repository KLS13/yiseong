package com.koreait.test;

import java.util.Scanner;

//성적 관리 프로그램
// 5명의 int형 점수를 저장하는 scores 배열을 선언하고
// 점수를 입력받아 최대,최소, 평균 점수를 출력하기
//string 형 배열 names를 선언하고, 5명의 이름을 초기화 한뒤 활용
public class Test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int MAX,MIN ;
		int sum=0;

		int[] scores = new int[5];	
		String[] names = {"강호동","유재석","신동엽","전현무","홍길동"};
		for(int i =0; i<scores.length; i++) {
			System.out.print(names[i] + "의 점수 입력 >> ");
			scores[i] = input.nextInt();
		}
		MAX = scores[0];
		MIN = scores[0];
		String first = "강호동";
		String last = "강호동";
		
		for(int i=0; i<scores.length; i++) {
			
			if(MAX < scores[i]) {
				MAX = scores[i];
				first=names[i];
		}
			if(MIN > scores[i]) {
				MIN = scores[i];
				last=names[i];
			}
			sum += scores[i];
		}
		for(int i=0; i<scores.length;i++) {
			System.out.println(names[i] + "점수는" + scores[i]);
			}
		System.out.println("최대점수" + MAX + "최저점수" + MIN + "평균" + (double)(sum/scores.length));
		System.out.println("최대 : " + first + ", 최소 : " + last);
		
		input.close();

	}

}
