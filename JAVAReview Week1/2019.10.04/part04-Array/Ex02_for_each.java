package com.koreait.ex;

import java.util.Scanner;

public class Ex02_for_each {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = new int[3];
		// 1. �Ϲ� for��
		for ( int i=0; i<arr.length; i++) {
			System.out.print(i + 1 + "��° �Է� >> ");
			arr[i]=scanner.nextInt();
		}
		for( int num : arr) { // arr �迭�� �� ��Ҹ� num ������ �����ؼ� ó��
			System.out.println(num);
			
		}
		//���ǻ���
		int[] arr2 = new int[3];
		int i=0;
		//1. for - each ���� ���� �Է�
		// �⺻�ڷ����� �迭�� for-each������ �迭�� ������ �Ұ����ϴ�.
		// �ܼ��ϰ� �����ؼ� �������°Ÿ� ����.
		// �迭�� ���� ���������ʰ� �迭 ����� ���� �ٸ� ������ �޾Ƽ� ó���ϱ� ������.
		for(int num : arr2) {
			System.out.print("�Է� >> ");
			num = scanner.nextInt();
		}
		
		for(int num : arr2) {
			System.out.println("arr2["+i+"] = "+num);
			i++;
		}
		

		scanner.close();
	}
}