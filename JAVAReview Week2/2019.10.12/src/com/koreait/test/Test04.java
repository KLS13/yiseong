package com.koreait.test;

public class Test04 {

	public static void main(String[] args) {

		int ballCount = 45;
		int[] balls = new int[ballCount];
		int[] picks = new int[6];
		int i, j;
		
		// 1. 1 ~ 45 까지 순차적으로 채워 넣기
		for (i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		
		// 2. 6개 picks 배열에 저장
		for (j = 0; j < picks.length; j++) {
			int idxOfPick = (int)(Math.random() * ballCount);	// 뽑을 인덱스를 랜덤 생성
			picks[j] = balls[idxOfPick];						// 뽑아서 picks 배열에 저장
			int lastIndex = 44 - j;								// 마지막 인덱스 계산
			if (idxOfPick != lastIndex) {
				balls[idxOfPick] = balls[lastIndex];			// 뽑은 자리 <- 마지막 인덱스 값
			}
			ballCount--;
		}
		
		// 3. 보너스 번호
		int idxOfPick = (int)(Math.random() * ballCount);
		int bonus = balls[idxOfPick];
		
		// 4. picks 배열 출력 (오름차순 정렬) + 보너스 번호 출력
		// 버블 소트
		boolean beChanged;
		for (i = 0; i < picks.length - 1; i++) {
			beChanged = false;
			for (j = 0; j < picks.length - 1 - i; j++) {
				if (picks[j] > picks[j + 1]) {
					int temp = picks[j];
					picks[j] = picks[j + 1];
					picks[j + 1] = temp;
					beChanged = true;
				}
			}
			if (!beChanged) {
				break;
			}
		}
		
		System.out.print("이번 주 당첨번호 : ");
		for (j = 0; j < picks.length; j++) {
			System.out.print(picks[j]);
			if (j != picks.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("이번 주 보너스번호 : " + bonus);
		
	}

}







