package com.koreait.ex;

public class PersonMain {

	public static void main(String[] args) {

		Person woman = new Person();
		Person man = new Person("james", 20, 175.5, '남');
		
		// woman.name = "alice";  private 처리되었기 때문에 모든 Field는 직접 접근이 안 됨!
		woman.setName("alice");   // public 처리된 메소드 setName 을 통해 우회 접근만 가능!
		woman.setAge(20);
		woman.setHeight(168.5);
		woman.setGender('여');
		
		System.out.println("성명 : " + woman.getName());
		System.out.println("나이 : " + woman.getAge());
		System.out.println("신장 : " + woman.getHeight());
		System.out.println("성별 : " + woman.getGender());
		
		System.out.println("성명 : " + man.getName());
		System.out.println("나이 : " + man.getAge());
		System.out.println("신장 : " + man.getHeight());
		System.out.println("성별 : " + man.getGender());
		
	}

}
