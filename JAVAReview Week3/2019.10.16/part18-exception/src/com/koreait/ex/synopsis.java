package com.koreait.ex;
/*
예외
	1. 오류 : 에러, 개발자가 손 못대는 수준
	2. 예외 : 개발자가 회피할 수 있는 수준
	3. 예외클래스의 계층 구조
		Object - Throwable - Exception - RuntimeException 
									   - IOException
									   - ClassNotFoundException
									   - ...
									   - 사용자 정의 예외
 	4. 모든 예외는 Exception 클래스로 처리할 수 있다.
 	5. 예외 처리 형식
 		try {
 		.....
 		  예외가 발생할 가능성이 있는 구역
 		 } catch(예외를 받는 매개변수) {
 		 	받은 예외를 처리하는 구역
 		 	}finally {
 		 		무조건 실행되는 구역
 		 		}
*/