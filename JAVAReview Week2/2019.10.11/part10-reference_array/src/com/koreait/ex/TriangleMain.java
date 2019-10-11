package com.koreait.ex;

import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Triangle[] arr = new Triangle[3];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(" 삼각형 너비 입력 >> ");
			int width = scanner.nextInt();
			System.out.print(" 삼각형 높이 입력 >> ");
			int height = scanner.nextInt();
			arr[i] = new Triangle(width, height); //실제 트라이앵글 객체의 생성
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println((i+1) + "번째 삼각형 --------------");
			arr[i].output();
		}
		scanner.close();
	}

}
