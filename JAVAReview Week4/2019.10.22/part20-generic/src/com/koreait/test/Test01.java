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
		System.out.println("arr1�� �� : " + sum(arr1));
		
		Double[] arr2 = {1.5, 2.5, 3.5};
		System.out.println("arr2�� �� : " + sum(arr2));
		
		// String[] arr3 = {"1.5", "2.5", "3.5"};
		// System.out.println("arr3�� �� : " + sum(arr3));		// Number ��� : numericType �� �����ϹǷ� String �Ұ�!

	}

}















