package theaterRevserve;

import java.util.*;

public class TheaterRevserve {
	public static void main(String[] args){
		final int size = 10;
		int[] seats = new int[size];
		int last = 0;

		while (true) {
			System.out.println("-------------------------");
			if(last == 10) {
				System.out.println("�����Դϴ�.");
				return;
			}
			
			for (int i = 0; i < size; i++) {
				System.out.print(i + 1 + " ");
			}
			System.out.println("\n-------------------------");
			for (int i = 0; i < size; i++) {
				System.out.print(seats[i] + " ");
			}
			System.out.println("\n-------------------------");

			
			System.out.print("���Ͻô� �¼���ȣ�� �Է��ϼ���(����� -1): ");
			System.out.println("���� �¼��� : " + (10-last));
			Scanner scan = new Scanner(System.in);			
			int s = scan.nextInt();
			try {
				if(s>10 || s<-1) {
					System.out.println("���� �¼� �����Դϴ�.");
					continue;
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
			if (s == -1) {
				System.out.println("���Žý��� ����");
				return;
			}

			if (seats[s - 1] == 0) {
				seats[s - 1] = 1;
				System.out.println("����Ǿ����ϴ�.");
				last += 1;
			}
			else {
				System.out.println("�̹� ����� �ڸ��Դϴ�.");
				System.out.println("���� �¼��� : " + (10-last));
			} 
		}
	}
}
