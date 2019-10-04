package com.koreait.ex;

import java.util.Scanner;

public class Ex02_for_each {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		// 1. 일반 for문
		for ( int i=0; i<arr.length; i++) {
			System.out.print(i + 1 + "번째 입력 >> ");
			arr[i]=scanner.nextInt();
		}
		for( int num : arr) { // arr 배열의 각 요소를 num 변수로 전달해서 처리
			System.out.println(num);
			
		}
		//주의사항
		int[] arr2 = new int[3];
		int i=0;
		//1. for - each 문을 통한 입력
		// 기본자료형의 배열은 for-each문으로 배열의 수정이 불가능하다.
		// 단순하게 접근해서 가져오는거만 가능.
		// 배열에 직접 접근하지않고 배열 요소의 값을 다른 변수로 받아서 처리하기 때문에.
		for(int num : arr2) {
			System.out.print("입력 >> ");
			num = scanner.nextInt();
		}
		
		for(int num : arr2) {
			System.out.println("arr2["+i+"] = "+num);
			i++;
		}
		

		scanner.close();
	}
}