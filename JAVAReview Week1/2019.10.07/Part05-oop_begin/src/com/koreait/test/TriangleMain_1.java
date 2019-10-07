package com.koreait.test;

import java.util.Scanner;

class Triangle_1 {
	int width;
	int height;
	
	void info(int width, int height) {
		System.out.println("가로는" + width + "높이는" + height);
	}
	void calcArea(int width, int height) {
		System.out.println("넓이는" + width*height/2.0);
	}
	
}


public class TriangleMain_1 {

	public static void main(String[] args) {
		Triangle_1 tri = new Triangle_1();
		Scanner input = new Scanner(System.in);
		
		System.out.print("가로 입력 >>");
		int width = input.nextInt();
		System.out.print("높이 입력 >>");
		int height = input.nextInt();
		
		tri.info(width, height);
		tri.calcArea(width, height);
		
		input.close();

	}

}
