// 성별을 의미하는 정수값  1,3남자   2,4 여자  입력
// "남자", "여자" 출력하기

package com.koreait.ex;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        System.out.println("1~4 정수값 입력하기");
        int num = input.nextInt();
        
        String gender = (num==1 || num==3) ? "남자" : "여자";
        System.out.println(gender);
	}

}
