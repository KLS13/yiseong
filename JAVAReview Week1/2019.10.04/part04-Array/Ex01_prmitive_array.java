package com.koreait.ex;

public class Ex01_prmitive_array {

	public static void main(String[] args) {
		/*
		 1. 배열(Array)
		 	- 선언 방법
		 		(1) int[] arr = new int[3];  // 길이가 3인 arr 배열
		 		(2) int arr[] = new int[3];
		 		 	int[] arr;  // 참조변수 arr 선언
		 		 	arr = new int[3]; // int 3개 생성 후 주소를 arr 에 저장
		 2. 초기화 방법
		 		(1) int[] arr = new int[]{10,20,30};
		 		(2) int[] arr = {10, 20, 30};
		 		(3) int[] arr;  
		 			arr = {10, 20, 30}; // 초기화 -> 이와 같은 방식은 불가능하다
		 3. 특징
		 		(1) 배열의 인덱스는 0부터 시작한다.
		 		(2) 배열이 생성되면 자동으로 0으로 초기화된다.
		 		(3) 배열이 생성되면 배열의 길이를 length 필드 값으로 사용할 수 있다.
		 		int[] arr = new int[3];
		 		배열의 길이 : arr.length == 3
		 		(4) 배열의 인덱스 사용 범위를 벗어나면 ArrayIndexOutOfBoundsException 예외 클래스가 발생.
		 */
		
		int[] arr1 = new int[3];
		int[] arr2 = {10, 20, 30};
		
		for(int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		for(int i=0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println(arr1[3]); // 인덱스 범위를 벗어난 요소
	}

}
