package com.koreait.ex;
/*
 재귀 호출 (recursive call)
 	1. 메소드가 자신을 호출할 때
 	2. 반복문의 처리, 복잡한 알고리즘 처리
 	3. 잘못 구현하면 무한루프
 */
public class RecursiveClass {
	
	//Field
	static int count = 0;
	
	//method
	static void recursive() {
		System.out.println("recursive() call");
		if(++count == 5) {
			return; // recursive 종료
		}
		recursive();  // 재귀호출 ( 자기가 자기를 부름 ) 
		
	}
	

	public static void main(String[] args) {
		recursive();

	}

}
