// �� ���� �Է� a b ����   �� ��ȯ
package com.koreait.ex;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �Է� >> ");
		int a = input.nextInt();
		System.out.print("���� �Է� >> ");
		int b = input.nextInt();
		
		System.out.println("a�� : " + a + ", b�� : " + b);
		
		int temp = a;
		a = b;
		b= temp;
		
		System.out.println("a�� : " + a + ", b�� : " + b);

	}

}
