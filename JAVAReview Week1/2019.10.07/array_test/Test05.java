package com.koreait.test;

import java.util.Scanner;
//5�ٷ� �� ������ �ִ�.
//�� �ٸ��� �л����� �ٸ���
// 1��:3��  2��:4��  3�� ~  4��~  5��: 5�� 
public class Test05 {

	public static void main(String[] args) {
		int[][] eClass = new int[5][];
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<eClass.length; i++) {
			System.out.print((i+1) + "��");
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
