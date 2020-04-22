package exam;

import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 1000 + 1); // answer에 1 ~ 1000사이의 랜덤값을 저장
		int input; 

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print("숫자를 입력해 주세요 (1 ~ 1000 사이) : ");
			input = scanner.nextInt();

			if (answer > input) { 
				System.out.println("Up"); 

			} else if (answer < input) { 
				System.out.println("Down"); 

			} else { 
				System.out.println("정답입니다 !");
				break; 
			}
		}
	}
}