package com.koreait.test;

import java.util.Scanner;

//���� ���� ���α׷�
// 5���� int�� ������ �����ϴ� scores �迭�� �����ϰ�
// ������ �Է¹޾� �ִ�,�ּ�, ��� ������ ����ϱ�
//string �� �迭 names�� �����ϰ�, 5���� �̸��� �ʱ�ȭ �ѵ� Ȱ��
public class Test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int MAX,MIN ;
		int sum=0;

		int[] scores = new int[5];	
		String[] names = {"��ȣ��","���缮","�ŵ���","������","ȫ�浿"};
		for(int i =0; i<scores.length; i++) {
			System.out.print(names[i] + "�� ���� �Է� >> ");
			scores[i] = input.nextInt();
		}
		MAX = scores[0];
		MIN = scores[0];
		String first = "��ȣ��";
		String last = "��ȣ��";
		
		for(int i=0; i<scores.length; i++) {
			
			if(MAX < scores[i]) {
				MAX = scores[i];
				first=names[i];
		}
			if(MIN > scores[i]) {
				MIN = scores[i];
				last=names[i];
			}
			sum += scores[i];
		}
		for(int i=0; i<scores.length;i++) {
			System.out.println(names[i] + "������" + scores[i]);
			}
		System.out.println("�ִ�����" + MAX + "��������" + MIN + "���" + (double)(sum/scores.length));
		System.out.println("�ִ� : " + first + ", �ּ� : " + last);
		
		input.close();

	}

}
