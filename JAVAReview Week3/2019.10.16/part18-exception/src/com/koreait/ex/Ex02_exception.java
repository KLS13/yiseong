package com.koreait.ex;

public class Ex02_exception {

	public static void main(String[] args) {
		int[] arr = new int[3];
		
		try {
		
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		
		for(int n : arr) {
			System.out.println(n);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 오류");
		}
	}

}
