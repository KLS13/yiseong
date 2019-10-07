package com.koreait.test;

import java.util.Scanner;
//5줄로 된 교실이 있다.
//각 줄마다 학생수가 다르다
// 1줄:3명  2줄:4명  3줄 ~  4줄~  5줄: 5명 
public class Test05 {

	public static void main(String[] args) {
		int[][] eClass = new int[5][];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<eClass.length; i++) {
			System.out.print((i+1) + "행");
			int personPerRow = input.nextInt();
			eClass[i] = new int[personPerRow];
			for (int j=0; j<eClass[i].length; j++) {
				eClass[i][j] = 1;
			}	
		}
		for( int i = 0; i< eClass.length;i++) {
			for(int j=0; j<eClass[i].length;j++) {
				System.out.print(eClass[i][j] + "\t");
			}
			System.out.println();
		}
		input.close();
	}
}
