package com.koreait.test2;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int i;
		int sum=0;
		
		while(true) {
		System.out.print("������ �Է��ϼ��� >> ");
		int num = input.nextInt();
		if(num>=2) {
			for(i=1;i<=num;i++) {
				sum+=i;
			}break;
		}else if(num<2) {
			continue;
		}
	}
		System.out.println(sum);	
		input.close();
	}
}
/*
 		Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		int start = 1;
		int end;
		
		do {
			System.out.print("2 �̻��� ��� �Է� >> ");
			end = scanner.nextInt();
		} while (end < 2);
		
		for (int num = start; num <= end; num++) {
			total += num;
		}
		
		System.out.println(start + "~" + end + "�� �� : " + total);
		
		scanner.close();
		
	}

}

 */
		