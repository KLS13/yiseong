package com.koreait.ex;

/*
 T[] arr; 가능  선언만 하는건 돼 ~~
 T[] arr = new T[3]; 불가능
 T obj = new T();  불가능
 */

public class Ex03_generic {
	
	
	//제네릭 메소드
	static <T> void printArray(T[] arr) {
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		
		Integer[] arr = { 1,2,3,4,5};
		printArray(arr);

		Double[] arr2 = { 1.4, 2.4,5.6};
		printArray(arr2);
		
		String[] arr3 = {"hello", "sidney"};
		printArray(arr3);
	}

}
