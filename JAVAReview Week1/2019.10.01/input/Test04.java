// ������ �ǹ��ϴ� ������  1,3����   2,4 ����  �Է�
// "����", "����" ����ϱ�

package com.koreait.ex;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.println("1~4 ������ �Է��ϱ�");
        int num = input.nextInt();
        
        String gender = (num==1 || num==3) ? "����" : "����";
        System.out.println(gender);
	}

}
