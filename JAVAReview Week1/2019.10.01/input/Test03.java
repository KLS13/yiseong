package com.koreait.ex;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		//����װ� ���  vip �Ϲ��� �Է¹޾�  ��� vip�� 20%����,  �Ϲ��̸� 5%����
		Scanner input = new Scanner(System.in);
		

		System.out.print("���� �Է�  >> ");
		int num = input.nextInt();
		System.out.print("��� �Է�  >> ");
		String grade = input.next();
		
		
		double result = (grade.equals("VIP") ? num*0.8 : num*0.95); 
		System.out.println("���ε� �ݾ���" + result);
	}

}
