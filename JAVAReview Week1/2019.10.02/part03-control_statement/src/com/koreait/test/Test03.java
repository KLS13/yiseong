////���̸� �Է� �޾� 7 ���� --> ������,  13���� --> �ʵ�  16����--> �ߵ�  19 ���� ���  ������ ����
package com.koreait.test;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int age = input.nextInt();
		
		if(age <= 7) {
			System.out.println("������");
		}else if(age <= 13) {
			System.out.println("�ʵ�");
		}else if(age <=16) {
			System.out.println("�ߵ�");
		}else if(age <=19) {
			System.out.println("���");
		}else {
			System.out.println("����");
		}

	}

}
