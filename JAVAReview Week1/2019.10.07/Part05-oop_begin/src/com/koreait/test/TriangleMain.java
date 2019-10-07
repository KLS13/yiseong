package com.koreait.test;
import java.util.*;

class Triangle {
	
	// Field
	int width;
	int height;
	
	// Method
	void init(Scanner scanner) {
		System.out.print("가로 입력 >>");
		width = scanner.nextInt();
		System.out.print("높이 입력 >>");
		height = scanner.nextInt();
	}
	
	double calcArea() {
		return width * height / 2.0;
	}
	void info() {
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
	}
	
}


public class TriangleMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Triangle semo = new Triangle();
		
		semo.init(scanner);
		semo.info();
		
	}

}
