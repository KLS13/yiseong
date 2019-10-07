package com.koreait.test;
import java.util.Scanner;

class Student {
	String name;
	String dept;
	String score1;
	String score2;
	double average;
	boolean isPass;
	
		void input(Scanner scanner) {
			System.out.print("이름 입력 >>");
			name = scanner.nextLine();
			System.out.print("학번 입력 >>");
			dept = scanner.nextLine();
			System.out.print("점수1 입력 >>");
			score1 = scanner.nextLine();
			System.out.print("점수2 입력 >>");
			score2 = scanner.nextLine();
			
			average = (Double.parseDouble(score1)+Double.parseDouble(score2)) / 2.0;
			if(average>=80) {
				isPass = true;
			}else {
				isPass = false;
			}
			
			}
		void output() {
			System.out.println("이름 : "+ name+ "학번 : " + dept + "평균 : " + average);
			System.out.println(isPass ? "합격" : "불합격");
			
			
		}
}