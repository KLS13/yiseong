package com.koreait.test;

import java.util.Scanner;

//UP-DOWN ����
//0~100 ���� ������ �߻��ȴ�.
//�߻��� ������ �����
//������� ������� ����ϰ� ���α׷� ����
public class Test01 {

	public static void main(String[] args) {
		int num = (int)(Math.random()*101);
		int count = 0 ;
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
		System.out.print("���� �Է� >> ");
		int input = scanner.nextInt();
		count ++;
		if(num == input) {
			System.out.println("�����Դϴ�." + count + "�� ���� ����");
			break;
		}
		if(num > input) {
			System.out.println("UP");
		}
		if(num < input) {
			System.out.println("Down");
		}
			
		}
		
		scanner.close();
		
		
	}

}
