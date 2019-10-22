package com.koreait.test;

public class Test01 {

	static <T extends Number> double sum(T[] arr) {
		double total = 0;
		for (int i= 0; i < arr.length; i++) {
			total += arr[i].doubleValue();
		}
		return total;
	}
	
	public static void main(String[] args) {

		Integer[] arr1 = {1, 2, 3, 4, 5};
		System.out.println("arr1의 합 : " + sum(arr1));
		
		Double[] arr2 = {1.5, 2.5, 3.5};
		System.out.println("arr2의 합 : " + sum(arr2));
		
		// String[] arr3 = {"1.5", "2.5", "3.5"};
		// System.out.println("arr3의 합 : " + sum(arr3));		// Number 상속 : numericType 만 가능하므로 String 불가!

	}

}















