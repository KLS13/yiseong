package com.koreait.test;
import java.util.*;

class Triangle {
	
	// Field
	int width;
	int height;
	
	// Method
	void init(Scanner scanner) {
		System.out.print("���� �Է� >>");
		width = scanner.nextInt();
		System.out.print("���� �Է� >>");
		height = scanner.nextInt();
	}
	
	double calcArea() {
		return width * height / 2.0;
	}
	void info() {
		System.out.println("�ʺ� : " + width);
		System.out.println("���� : " + height);
		System.out.println("ũ�� : " + calcArea());
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
