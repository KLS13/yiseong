//������ �Է� �޾� "¦��", "Ȧ��" �����ؼ� ����ϱ�  3�� ����� "3�� ������ ����ϱ�"

package com.koreait.test;

import java.util.Scanner;

public class test01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է� >> ");
		int num = input.nextInt();
		
		if(num%3==0) {
			System.out.println("3�� ���");
		}else if(num%2==0) {
			System.out.println("¦��");
		}else if(num%2>0) {
			System.out.println("Ȧ��");
		}
		input.close();
	}
}