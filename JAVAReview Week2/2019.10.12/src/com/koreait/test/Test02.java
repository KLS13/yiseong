package com.koreait.test;

import java.util.Scanner;

//���� ���� �� �� �ϳ��� �Է��ϸ� ����� ��Ÿ����.
// �̱�ų� ���� ����ϰ� ���� ���α׷� ����
// ���� ���
public class Test02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		
		while(true) {
			System.out.print("���� / ���� / �� ? ");
			String input = scanner.next();
			int num = (int)(Math.random()*3)+1;
			if(num==1) {
				System.out.println("���º�");
				draw++;
			}else if(num==2 ) {
				System.out.println("�¸�");
				win++;
			}else {
				System.out.println("�й�");
				lose++;
				break;
			}
		}
		System.out.println("������" + win +"��"+ lose + "��" + draw + "��");
		scanner.close();
	}
}

/*
package com.koreait.test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] GBB = {"����", "����", "��"};	// GBB[0] : "����", GBB[1] : "����", GBB[2] : "��"
		int win = 0;
		int draw = 0;
		
		game:		// game ���̺�
		while (true) {
			
			int idxOfCom = (int)(Math.random() * 3);
			int idxOfUser = 100;
			
			System.out.print("���� ���� �� >> ");
			String user = scanner.next();
			
			for (int i = 0; i < GBB.length; i++) {
				if (user.equals(GBB[i])) {
					idxOfUser = i;
				}
			}
			
			if (idxOfUser == 100) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			
			System.out.print("��ǻ�ʹ� " + GBB[idxOfCom] + ", ����� " + GBB[idxOfUser] + ", ");
			
			// 	idxOfUser - idxOfCom	�̰��!		����!		����!
			//  ����					-2			0			-1
			//  ����					1			0			-1
			//  ��						1			0			2
			
			switch (idxOfUser - idxOfCom) {
			case -2:
			case 1: System.out.println("�̰��!");
					win++;
					break;
			case 0: System.out.println("����!");
					draw++;
					break;
			default: System.out.println("����!");
					 break game;	// game ���̺��� �����Ѵ�!
			}
				
		}
		
		System.out.println(win + "�� " + draw + "�� �޼�!");
		scanner.close();
		
	}

}

*/