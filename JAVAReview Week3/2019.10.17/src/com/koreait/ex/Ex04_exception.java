package com.koreait.ex;

public class Ex04_exception {

	public static void main(String[] args) {
		
		try {
			String name = "aappaa";
			System.out.println("�̸� : " + name.toString());
		}catch(Exception e) {
			System.out.println("���� �߻�");
			System.out.println(e.getMessage());
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
			e.printStackTrace();
		}

	}

}
