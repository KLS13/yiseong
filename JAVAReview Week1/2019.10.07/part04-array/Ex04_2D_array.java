package com.koreait.ex;

public class Ex04_2D_array {

	public static void main(String[] args) {
		/*
		 ������ 2���� �迭
		 1. ��� ���� �����Ǿ� �ִ� 2���� �迭
		 2. ���� ���
		  	int[][] arr = new int[3][4];
		 3. �ʱ�ȭ ���
		 	int[][] arr = new int[][] { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		 	int[][] arr = { {1,2,3,4}, {5,6,7,8}, {9,10,11,12} };
		 */
		
		int[][] arr = new int[][] { {1,2,3}, {4,5,6} };
		
		for(int i =0; i<arr.length; i++) {
			for(int j = 0; j<arr[i].length;j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
