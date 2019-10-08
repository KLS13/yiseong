package com.koreait.ex;

public class PersonMain {

	public static void main(String[] args) {
		
		Person woman = new Person("alice", 20, 168.5, '여');
		
		woman.output();
		
		// Person man = new Person(); 을 호출하면 어떻게 되는가?
		// 개발자가 생성자를 하나도! 구현하지 않았다면 => 자바가 디폴트 생성자를 만들어서 호출
		// 개발자가 생성자를 하나라도! 구현했다면 => Person() { } 형태의 생성자가 없으면 오류 발생
		// 즉! 개발자가 생성자를 만들면, 개발자가 원하는 모습으로만! 객체를 생성할 수 있다.
		// Person man = new Person();
		
	}
	
}
