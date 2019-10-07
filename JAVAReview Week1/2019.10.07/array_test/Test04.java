package com.koreait.test;

public class Test04 {

	public static void main(String[] args) {
		
		int[] arr = {5,3,8,1,0,9};
		
		for(int i = 0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int num : arr) {
			System.out.print(num + "\t");
		}
		

	}

}
