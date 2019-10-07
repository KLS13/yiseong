package com.koreait.ex;

public class Ex05_2D_array {

	public static void main(String[] args) {
		/*
		 가변형 2차원 배열
		 	1. 행만 고정하고 열이 고정되어있찌 않은 배열
		 	2. 선언 방법
		 		int[][] arr = new int[3][];   3행 n열
		 		arr[0] = new int[3]; 0행은 3열 ~
 		 		arr[1] = new int[2]; 1행은 2열
 		 		arr[2] = new int[4]; 2행은 4열
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
