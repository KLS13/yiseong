package com.koreait.ex;

import java.util.Scanner;

public class TriangleMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Triangle[] arr = new Triangle[3];
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(" �ﰢ�� �ʺ� �Է� >> ");
			int width = scanner.nextInt();
			System.out.print(" �ﰢ�� ���� �Է� >> ");
			int height = scanner.nextInt();
			arr[i] = new Triangle(width, height); //���� Ʈ���̾ޱ� ��ü�� ����
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.println((i+1) + "��° �ﰢ�� --------------");
			arr[i].output();
		}
		scanner.close();
	}

}
