package com.koreait.test;

public class Test03 {

	public static void main(String[] args) {
		
		int[] arr = {5, 2, 6, 3, 7, 8, 9};
		boolean changed;
		/*
		 버블 소트(거품정렬)
		 앞뒤 요소만 계속 비교한다.
		 앞의 값이 크면 교환 : 오름차순
		 뒤의 값이 크면 교환 : 내림차순
		 */
		
		for(int i=0; i<arr.length-1;i++) {
			changed = false; // 교환된적이 없다.
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) { // 오름(>)/내림 차순(<)
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
					changed = true; //교환된적이 있따.
				}
			}
			if(!changed) { // 교환된게 없다면 그만 !
				break;
			}
		}
		for(int num : arr) {
			System.out.print(num + "\t");
		}
	}
}
