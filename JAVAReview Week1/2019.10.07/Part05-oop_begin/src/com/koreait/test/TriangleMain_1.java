package com.koreait.test;

import java.util.Scanner;

class Triangle_1 {
	int width;
	int height;
	
	void info(int width, int height) {
		System.out.println("���δ�" + width + "���̴�" + height);
	}
	void calcArea(int width, int height) {
		System.out.println("���̴�" + width*height/2.0);
	}
	
}


public class TriangleMain_1 {

	public static void main(String[] args) {
		Triangle_1 tri = new Triangle_1();
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �Է� >>");
		int width = input.nextInt();
		System.out.print("���� �Է� >>");
		int height = input.nextInt();
		
		tri.info(width, height);
		tri.calcArea(width, height);
		
		input.close();

	}

}
