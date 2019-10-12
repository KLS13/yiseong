package com.koreait.test;

public class Test04 {

	public static void main(String[] args) {

		int ballCount = 45;
		int[] balls = new int[ballCount];
		int[] picks = new int[6];
		int i, j;
		
		// 1. 1 ~ 45 ���� ���������� ä�� �ֱ�
		for (i = 0; i < balls.length; i++) {
			balls[i] = i + 1;
		}
		
		// 2. 6�� picks �迭�� ����
		for (j = 0; j < picks.length; j++) {
			int idxOfPick = (int)(Math.random() * ballCount);	// ���� �ε����� ���� ����
			picks[j] = balls[idxOfPick];						// �̾Ƽ� picks �迭�� ����
			int lastIndex = 44 - j;								// ������ �ε��� ���
			if (idxOfPick != lastIndex) {
				balls[idxOfPick] = balls[lastIndex];			// ���� �ڸ� <- ������ �ε��� ��
			}
			ballCount--;
		}
		
		// 3. ���ʽ� ��ȣ
		int idxOfPick = (int)(Math.random() * ballCount);
		int bonus = balls[idxOfPick];
		
		// 4. picks �迭 ��� (�������� ����) + ���ʽ� ��ȣ ���
		// ���� ��Ʈ
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
		
		System.out.print("�̹� �� ��÷��ȣ : ");
		for (j = 0; j < picks.length; j++) {
			System.out.print(picks[j]);
			if (j != picks.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println();
		System.out.println("�̹� �� ���ʽ���ȣ : " + bonus);
		
	}

}







