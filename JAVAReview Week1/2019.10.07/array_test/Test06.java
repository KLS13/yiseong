package com.koreait.test;

import java.util.Scanner;

//���� ���� ���α׷�
/*
3���� : subjects �迭 -->  ���� ���� ����
3�л� : names �迭       -->  ö�� ���� ����
������  scores �迭
���� ��)
ö�� ���� �Է� :
  ���� >>
  ���� >>
  ���� >>

	���� ���� ���� ����
ö��
����
����
�հ�                   
*/

public class Test06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] subjects = {"����","����","����","����"};
		String[] names = {"ö��","����","����","�հ�"};
		int[][] scores = new int[4][4];
		
		for(int i = 0; i<subjects.length-1; i++){
			System.out.println(names[i] + "�� ���� �Է�");		
			for(int j=0; j<subjects.length-1; j++) {
				System.out.print(subjects[j] + ">>");
				scores[i][j] = input.nextInt();
				scores[i][3] += scores[i][j]; // �л��� ����
				scores[3][j] += scores[i][j]; // ������ �հ�
				scores[3][3] += scores[i][j]; // ��ü ����
			}
		}
		for(int i=0;i<subjects.length;i++) {
			System.out.print("\t"+subjects[i]);
			}
		System.out.println();
		for(int i=0;i<scores.length; i++) {
			System.out.print(names[i]+"\t");
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+"\t");
			}
			System.out.println();
		}
		input.close();
		
	}

}
