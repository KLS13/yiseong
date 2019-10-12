package com.koreait.test;

import java.util.Scanner;

// 0~9 사이에 랜덤  난수 3개를 중복없이 발생시킨다.
// 3개의 숫자를 입력해서 맞춘다.
// 값과 위치가 같으면 1 스트라이크 ,  값은 같은데 위치가 다르면 1 볼
// 실행 예)  난수 1 2 3 일때

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
			System.out.println("정수 3개 입력 >>");
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
			System.out.println(strike +"스트라이크," + ball + "볼");
		}
		
		System.out.println("게임종료");
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
			System.out.println(strike + "스트라이크, " + ball + "볼!");
		} while (strike != 3);
		
		System.out.println(count + "번만에 성공!");
		
	}

}

 */


