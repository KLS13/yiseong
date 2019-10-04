package com.koreait.test2;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		int sum=0;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("정수를 입력하세요 (1) >> ");
		int num1 = input.nextInt();
		System.out.print("정수를 입력하세요 (2) >> ");
		int num2 = input.nextInt();
		
		if(num1<num2) {
		for(int i= num1; i<=num2; i++) {
			sum=sum+i;
			}
		System.out.println(sum);
		}else if(num2<num1) {
			for(int i=num2; i<=num1; i++) {
				sum=sum+i;
			}
			System.out.println(sum);
		}else{
			if(num1==num2) {
				System.out.println("입력받은 정수가 같음.");
			}
		}
			input.close();
		}
		}
/*
 	Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		int start;
		int end;
		
		// 1. 일단 입력
		System.out.print("첫 번째 정수 >> ");
		start = scanner.nextInt();
		System.out.print("두 번째 정수 >> ");
		end = scanner.nextInt();
		
		// 2. start, end 크기 비교
		// 언제나 start <= end 되도록 조정하기 위함
		// start > end 인 경우 두 변수를 "교환"
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		for (int num = start; num <= end; num++) {
			total += num;
		}
		
		System.out.println(start + "~" + end + "의 합 : " + total);
		
		scanner.close();
		
	}

}



 */
	


