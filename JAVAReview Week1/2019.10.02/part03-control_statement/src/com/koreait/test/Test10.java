package com.koreait.test;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("점수 입력 >> ");
		int score = scanner.nextInt();
		
		char grade, point = 0;
		
		switch (score % 10) {
		case 0: case 1: case 2: case 3:
			point = '-'; break;
		case 4: case 5: case 6:
			point = '0'; break;
		case 7: case 8: case 9:
			point = '+';
		}
		
		switch (score / 10) {
		case 10: point = '+';
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		default: grade = 'F'; point = ' ';
		}
		
		System.out.println("학점 = " + grade + point);
		
		scanner.close();
		
	}

}








