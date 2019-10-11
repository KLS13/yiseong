package com.koreait.ex;

import java.util.Scanner;

public class TriangleMain2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Triangle[] arr = new Triangle[3];
		
		for(int i =0; i<arr.length; i++) {
			arr[i] = new Triangle();
		}
		
		for(Triangle semo : arr) {
			System.out.print(" 삼각형 너비 입력 >> ");
			semo.width = scanner.nextInt();
			System.out.print(" 삼각형 높이 입력 >> ");
			semo.height = scanner.nextInt();
		}
	for(Triangle semo : arr) {
		semo.output();
		}
		scanner.close();
	}

}
