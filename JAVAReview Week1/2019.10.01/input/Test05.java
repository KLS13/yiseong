//국어 영어 수학 점수를 입력받아 평균과 학점 출력
package com.koreait.ex;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		

		System.out.print("국어점수 입력  >> ");
		int kor = input.nextInt();
		System.out.print("수학점수 입력  >> ");
		int mat = input.nextInt();
		System.out.print("영어점수 입력  >> ");
		int eng = input.nextInt();
		
		double avg = (kor+mat+eng)/3.0;
		
		String grade = avg>90 ? "A학점" : avg > 80 ? "B학점" : avg >70 ? "C학점" : avg > 60? "D학점" : "F학점";
		
		System.out.println("평균점수는 " + avg + ", 학점은 " + grade);
		

	}

}
