package com.koreait.ex;

/*
 예외 클래스 : Exception 을 상속받아서 만든다.
 */
class MyException  extends Exception {
	public MyException(String message) {
		// super() == Exception(message) -> Throwable(String message) { detailMessage = message ; }
		super(message);
	}
}

public class Ex08_exception {

	public static void main(String[] args) {
	
		try {
			throw new MyException("내가 만든 예외 ! ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
