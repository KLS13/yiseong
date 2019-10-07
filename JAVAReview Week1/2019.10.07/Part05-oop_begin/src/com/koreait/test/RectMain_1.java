package com.koreait.test;

import java.util.Scanner;

public class RectMain_1 {

	public static void main(String[] args) {
		Rect_1 rec = new Rect_1();
		Scanner input = new Scanner(System.in);
		
		System.out.print("가로 입력 >>");
		int width = input.nextInt();
		System.out.print("세로 입력 >>");
		int height = input.nextInt();
		
		rec.info(width, height);
		rec.calcArea(width, height);
		
		input.close();

	}

}
