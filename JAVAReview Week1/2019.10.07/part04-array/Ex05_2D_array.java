package com.koreait.ex;

public class Ex05_2D_array {

	public static void main(String[] args) {
		/*
		 ������ 2���� �迭
		 	1. �ุ �����ϰ� ���� �����Ǿ����� ���� �迭
		 	2. ���� ���
		 		int[][] arr = new int[3][];   3�� n��
		 		arr[0] = new int[3]; 0���� 3�� ~
 		 		arr[1] = new int[2]; 1���� 2��
 		 		arr[2] = new int[4]; 2���� 4��
		 */
		
		int [][] arr = { {1,2,3,}, {4,5}, {6,7,8,9} };
		
		for(int i = 0 ; i < arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
