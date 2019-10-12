package com.koreait.test;

import java.util.Scanner;

//가위 바위 보 중 하나를 입력하면 결과가 나타난다.
// 이기거나 비기면 계속하고 지면 프로그램 종료
// 전적 출력
public class Test02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		
		while(true) {
			System.out.print("가위 / 바위 / 보 ? ");
			String input = scanner.next();
			int num = (int)(Math.random()*3)+1;
			if(num==1) {
				System.out.println("무승부");
				draw++;
			}else if(num==2 ) {
				System.out.println("승리");
				win++;
			}else {
				System.out.println("패배");
				lose++;
				break;
			}
		}
		System.out.println("전적은" + win +"승"+ lose + "패" + draw + "무");
		scanner.close();
	}
}

/*
package com.koreait.test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[] GBB = {"가위", "바위", "보"};	// GBB[0] : "가위", GBB[1] : "바위", GBB[2] : "보"
		int win = 0;
		int draw = 0;
		
		game:		// game 레이블
		while (true) {
			
			int idxOfCom = (int)(Math.random() * 3);
			int idxOfUser = 100;
			
			System.out.print("가위 바위 보 >> ");
			String user = scanner.next();
			
			for (int i = 0; i < GBB.length; i++) {
				if (user.equals(GBB[i])) {
					idxOfUser = i;
				}
			}
			
			if (idxOfUser == 100) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			System.out.print("컴퓨터는 " + GBB[idxOfCom] + ", 당신은 " + GBB[idxOfUser] + ", ");
			
			// 	idxOfUser - idxOfCom	이겼다!		비겼다!		졌다!
			//  가위					-2			0			-1
			//  바위					1			0			-1
			//  보						1			0			2
			
			switch (idxOfUser - idxOfCom) {
			case -2:
			case 1: System.out.println("이겼다!");
					win++;
					break;
			case 0: System.out.println("비겼다!");
					draw++;
					break;
			default: System.out.println("졌다!");
					 break game;	// game 레이블을 종료한다!
			}
				
		}
		
		System.out.println(win + "승 " + draw + "무 달성!");
		scanner.close();
		
	}

}

*/