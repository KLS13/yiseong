package com.koreait.ex;

public class Ex04_exception {

	public static void main(String[] args) {
		
		try {
			String name = "aappaa";
			System.out.println("이름 : " + name.toString());
		}catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			e.printStackTrace();
		}

	}

}
