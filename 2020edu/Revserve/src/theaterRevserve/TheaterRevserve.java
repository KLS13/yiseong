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
				System.out.println("만석입니다.");
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

			
			System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): ");
			System.out.println("남은 좌석수 : " + (10-last));
			Scanner scan = new Scanner(System.in);			
			int s = scan.nextInt();
			try {
				if(s>10 || s<-1) {
					System.out.println("없는 좌석 정보입니다.");
					continue;
				}
			}catch(Exception e){
				e.printStackTrace();
			}
			
			if (s == -1) {
				System.out.println("예매시스템 종료");
				return;
			}

			if (seats[s - 1] == 0) {
				seats[s - 1] = 1;
				System.out.println("예약되었습니다.");
				last += 1;
			}
			else {
				System.out.println("이미 예약된 자리입니다.");
				System.out.println("남은 좌석수 : " + (10-last));
			} 
		}
	}
}
