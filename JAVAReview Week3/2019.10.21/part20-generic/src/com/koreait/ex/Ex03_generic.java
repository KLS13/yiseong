package com.koreait.ex;

/*
 T[] arr; ����  ���� �ϴ°� �� ~~
 T[] arr = new T[3]; �Ұ���
 T obj = new T();  �Ұ���
 */

public class Ex03_generic {
	
	
	//���׸� �޼ҵ�
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
