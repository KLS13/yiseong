package com.koreait.ex;

public class Ex10_operator03 {

	public static void main(String[] args) {
		/* 
		 관계연산자
		  >= : 이상, 크거나 같다
		  >  : 초과, 크다
		  <= : 이하, 작거나 같다
		  <  : 미만, 작다
		  == : 같다
		  	equals
		  != : 같지 않다
		  
		  논리연산자
		  && : and 연산
		  || : or 연산
		  !  : not 연산
		  short evaluate 를 지원
		  
		 조건 연산자
		  -  ? :    (조건식) ?  true일경우 : false일경우
		 */
		
		int a = 10;
		System.out.println(a == 10 && a < 100); 
		System.out.println(a != 10 || a == 10); 
		System.out.println(!(a==10));
		
		int b = 10;
		boolean result = (a==100) && (++b > 10);
		System.out.println("result : " + result + ", b : " + b);
		
		int age = 18;
		boolean isAdult = (age >= 20) ? true : false;
		int fee = isAdult? 4000 : 2000;
		System.out.println(("요금 : " + fee));
		
		String id = "admin";
		String auth = id.equals("admin") ? "인증성공" : "인증실패";
		
		System.out.println(auth);
		
	}

}
