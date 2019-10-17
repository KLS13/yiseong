package com.koreait.ex;

/*
 ���� Ŭ���� : Exception �� ��ӹ޾Ƽ� �����.
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
			throw new MyException("���� ���� ���� ! ");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
