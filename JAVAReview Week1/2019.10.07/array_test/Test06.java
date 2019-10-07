package com.koreait.test;

import java.util.Scanner;

//성적 관리 프로그램
/*
3과목 : subjects 배열 -->  국어 영어 수학
3학생 : names 배열       -->  철수 미희 영희
점수들  scores 배열
실행 예)
철수 성적 입력 :
  국어 >>
  영어 >>
  수학 >>

	국어 영어 수학 총점
철수
미희
영희
합계                   
*/

public class Test06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] subjects = {"국어","영어","수학","총점"};
		String[] names = {"철수","미희","영희","합계"};
		int[][] scores = new int[4][4];
		
		for(int i = 0; i<subjects.length-1; i++){
			System.out.println(names[i] + "의 점수 입력");		
			for(int j=0; j<subjects.length-1; j++) {
				System.out.print(subjects[j] + ">>");
				scores[i][j] = input.nextInt();
				scores[i][3] += scores[i][j]; // 학생의 총점
				scores[3][j] += scores[i][j]; // 과목의 합계
				scores[3][3] += scores[i][j]; // 전체 총점
			}
		}
		for(int i=0;i<subjects.length;i++) {
			System.out.print("\t"+subjects[i]);
			}
		System.out.println();
		for(int i=0;i<scores.length; i++) {
			System.out.print(names[i]+"\t");
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
		input.close();
		
	}

}
