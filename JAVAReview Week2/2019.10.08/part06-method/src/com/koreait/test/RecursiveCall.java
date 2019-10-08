package com.koreait.test;


public class RecursiveCall {
	
	static int count = 0;
	
	static void recursiveCall(int _count) {
		System.out.println("hello");
		count++;
		if(count == _count) {
			return;
		}
		recursiveCall(_count);
		
	}
	
	/*
	 	static void recursive(int count) {
		if (count == 0) {
			return;
		} else {
			System.out.println("Hello");
			recursive(count - 1);
		}
	}
	
	 */

	public static void main(String[] args) {
		recursiveCall(5);

	}

}
