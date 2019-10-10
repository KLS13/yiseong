package com.koreait.ex;

public class ManMain {
	
	//main 메소드에 static 이 필요한 이유
	//main 메소드를 포함하는 클래스의 객체(인스턴스) 생성없이 main을 호출하기 위해서
	//예) new ManMain() 없이 main 메소드의 호출을 위해 static 이 반드시 필요하다.

	public static void main(String[] args) {
		Man man = new Man("홍길동",20);
		
		man.output();
		
		// GENDER 필드는 static 필드이기 때문에 new와 상관없이 접근가능
		System.out.println(Man.GENDER);
		System.out.println(man.GENDER); //가능은 하지만 추천X  "의미없음"
		
		//System.out.println(Man.age); --> static 만 클래스. 호출가능
		System.out.println(man.age); 
		
		
		
	}

}
