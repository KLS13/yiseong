package exam;

import java.util.Scanner;

public class exam02 {
	public static void main(String[] args) {
		int answer = (int) (Math.random() * 1000 + 1); // answer�� 1 ~ 1000������ �������� ����
		int input; 

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.print("���ڸ� �Է��� �ּ��� (1 ~ 1000 ����) : ");
			input = scanner.nextInt();

			if (answer > input) { 
				System.out.println("Up"); 

			} else if (answer < input) { 
				System.out.println("Down"); 

			} else { 
				System.out.println("�����Դϴ� !");
				break; 
			}
		}
	}
}