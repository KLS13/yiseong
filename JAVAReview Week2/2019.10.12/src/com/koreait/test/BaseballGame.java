package com.koreait.test;

import java.util.Scanner;

class BaseballGameTest05 {
	
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
		System.out.print("도전 >> ");
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

public class BaseballGame {

	public static void main(String[] args) {
		BaseballGameTest05 game = new BaseballGameTest05();
		int strike;
		int ball;
		int count = 0;
		
		game.gameStart();
		
		do {
			count++;
			game.challenge();
			strike = game.numOfStrike();
			ball = game.numOfBall();
			System.out.println(strike + "스트라이크, " + ball + "볼!");
		} while (strike != 3);
		
		System.out.println(count + "번만에 성공!");
		
	}

}