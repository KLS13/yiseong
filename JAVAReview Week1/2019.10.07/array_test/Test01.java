//길이가 5, 사용자로부터 입력 --> 합 출력
package com.koreait.test;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		// 1. 일반 for문
		for ( int i=0; i<arr.length; i++) {
			System.out.print(i + 1 + "번째 입력 >> ");
			arr[i]=input.nextInt();
		}
		for( int num : arr) { // arr 배열의 각 요소를 num 변수로 전달해서 처리
			sum += num;			
		}
		System.out.println(sum);
		input.close();
	}
}
/*
 	int[] arr = new int[5];
		int total = 0;
		
		for (int i = 0; i < arr.length; i++) {
			// 1. 입력
			System.out.print("정수 입력 >> ");
			arr[i] = scanner.nextInt();
			// 2. 합계
			total += arr[i];
		}
		
		System.out.println("합 : " + total);
		
		scanner.close();
		
	}

}
*/
