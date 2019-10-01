package com.koreait.ex;

public class Ex04_PrimitiveType {

	public static void main(String[] args) {

		/*
		 1. 기본 자료형
		  1) byte타입
		 	- 크기 : 1바이트
		 	- 개수 : 2의 8제곱(256개)
		 	- 범위 : -128 ~ 127 ( -2의 7제곱 ~ 2의 7제곱 )
		  2) short
		    - 크기 : 2바이트
		    - 개수 : 2의 16제곱 (65,636개)
		    - 범위 : -32,768 ~ 32,767
		  3) int
		  	- 크기 : 4바이트
		  	- 개수 : 2의 32제곱
		  	- 범위 : -2147483648 ~ 2147483648
		  	
		  4) long
		  	- 크기 : 8바이트
		  	- 개수 : 2의 64제곱
		  	- 범위 : -9223372036854775808 ~ 9223372036854775807
		  	
		  5) int를 벗어나는 값은 접미사 L 표기
		  6) long 으로 처리가 안되는 숫자는 BigInteger 이용
		  
		  변수 선언
		  1. 아무데서나 선언 가능
		  2. 변수명은 첫 글자를 소문자로하고 camel case 방식
		  	 ( 각 단어의 첫 글자만 대문자로 하고, 나머지는 소문자로 한다.
		  	 예 : myAge 
		  3. 영문,숫자,밑줄(_), 한글이 가능.
		  */
		
		//코드 복사 : 커서를 두고 ctrl + Alt + ↓;
		//코드 복사 : 커서를 두고 ctrl + Alt + ↓;
		byte var1 = 127;
		short var2 = 32767;
		int var3 = 21000;
		long var4 = 1000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
		
		/*
		  실수형
		  float
		   - 크기 : 4바이트
		   - 구성 : 부호 + 지수 + 소수
		   - 범위 : -1.4E-45 ~ (부호 : -, 지수 : E-45 10의 -45제곱)
		  double
		   - 크기 : 8바이트
		   - 구성 : -4.0E-324 ~
		  모든 실수형은 오차가 있다.
		 */
		float var5 = 3.14f;
		double var6 = 3.14;
		
		System.out.println(var5);
		System.out.println(var6);
		
		/*
		 문자형
		  char
		   - 크기 : 2바이트( C의 char은 1바이트 )
		    영어 1바이트 , 한글 2바이트
		    
		    코드
		    ASCII : 1바이트 영문 표준 코드
		    UNICODE : 2바이트 국제 표준 코드
		    
		     */
		char ch1 = 'A';
		char ch2 = '한';
		
		System.out.println(""+ch1 + ch2);
		
		/*
		 논리형
		  boolean
		   - 참 : true
		   - 거짓 : false
		   - 관계 연산자, 논리 연산자의 결과 
		   - 변수명 : is 로 시작하는 것이 일반적
		
		 문자열
		  String
		   - 참조 자료형
		   - 값을 저장하지 않고 주소를 저장
		   
		  String str1 = new String("Java");
		  	  
		 */
		boolean isPositive;
		isPositive = true;
		if(isPositive) {
			System.out.println("양수이다");
		}
		String str = "Hello";
		System.out.println(str);

	}

}
