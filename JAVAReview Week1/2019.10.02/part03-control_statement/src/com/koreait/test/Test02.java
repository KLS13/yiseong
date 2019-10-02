//필기와 실기 점수 입력 --> 합격 유무 출력하기 -->  필기,실기 70이상 또는 평균이 80 이상 --> 합격   아니면 불합격
package com.koreait.test;
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("필기점수 입력 : ");
		int score1 = input.nextInt();
		System.out.print("실기점수 입력 : ");
		int score2 = input.nextInt();
		
		if( (score1 >=70 && score2 >=70) ||(score1 + score2)/2.0 >=80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
}
