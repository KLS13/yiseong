package com.koreait.test;

import java.util.Scanner;

// 0~9 ���̿� ����  ���� 3���� �ߺ����� �߻���Ų��.
// 3���� ���ڸ� �Է��ؼ� �����.
// ���� ��ġ�� ������ 1 ��Ʈ����ũ ,  ���� ������ ��ġ�� �ٸ��� 1 ��
// ���� ��)  ���� 1 2 3 �϶�

public class Test03 {

	public static void main(String[] args) {
		int strike =0;
		int ball=0;
		int[] num = new int[3]; 
		int[] n = new int[3];

		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*9)+1;
			
		}
		
		while(strike != 3) {
			System.out.println("���� 3�� �Է� >>");
			for(int i=0; i<n.length;i++) {		
				n[i] = scanner.nextInt();
			}
			strike =0;
			ball=0;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++ ) {
					if(num[i]==n[j]) {
						if(i==j) {
							strike ++;
						}else if(i!=j){
							ball++;
							
						}
					}
					
				}
			}
			/*for(int i=0; i<3;i++) {
				System.out.print(num[i] + "\t");
			}*/
			System.out.println(strike +"��Ʈ����ũ," + ball + "��");
		}
		
		System.out.println("��������");
		}
	}

/*
package com.koreait.test;

import java.util.Scanner;

class BaseballGame {
	
	// Field
	int[] com = new int[3];
	int[] user = new int[3];
	Scanner scanner = new Scanner(System.in);
	
	// Method
	void gameStart() {
		com[0] = (int)(Math.random() * 10);
		do {
			com[1] = (int)(Math.random() * 10);
		} while (com[0] == com[1]);
		do {
			com[2] = (int)(Math.random() * 10);
		} while (com[0] == com[2] || com[1] == com[2]);
	}
	void challenge() {
		System.out.print("���� >> ");
		for (int i = 0; i < user.length; i++) {
			user[i] = scanner.nextInt();
		}
	}
	int numOfStrike() {
		int strike = 0;
		for (int i = 0; i < com.length; i++) {
			if (com[i] == user[i]) {
				strike++;
			}
		}
		return strike;
	}
	int numOfBall() {
		int ball = 0;
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if (com[i] == user[j] && i != j) {
					ball++;
				}
			}
		}
		return ball;
	}
	
}

public class Test03 {

	public static void main(String[] args) {

		BaseballGame game = new BaseballGame();
		int strike;
		int ball;
		int count = 0;
		
		game.gameStart();
		
		do {
			count++;
			game.challenge();
			strike = game.numOfStrike();
			ball = game.numOfBall();
			System.out.println(strike + "��Ʈ����ũ, " + ball + "��!");
		} while (strike != 3);
		
		System.out.println(count + "������ ����!");
		
	}

}

 */


