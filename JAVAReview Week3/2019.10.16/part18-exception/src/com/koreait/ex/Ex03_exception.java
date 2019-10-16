package com.koreait.ex;

public class Ex03_exception {

	public static void main(String[] args) {
		// Run - Run configuration 을 통해 전달된 arguments 는 String[] args에 저장됨.
		
		try {
		char gender = (int)(args[0].charAt(7)) % 2 == 1 ? '남' : '여';
		System.out.println(gender);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Run-Run configuration 메뉴를 통해 주민등록번호를 전달하세요 ");
		}
	}

}
