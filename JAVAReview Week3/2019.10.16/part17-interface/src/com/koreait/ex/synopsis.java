/*
인퍼페이스 ( interface )
	1. 추상클래스가 인터페이스로 발전한다.
	2. 특정 규칙을 지킨 추상클래스가 인터페이스 이다.
	3. 인터페이스가 되기 위한 규칙
		1) public final static 상수  만 선언할 수 있다.
		2) public abstract 리턴타입 메소드명  만 선언할 수 있다.
		3) public default 리턴타입 메소드명() { } 도 추가할 수 있따. ( jdk 1.8 이후) 
		4) public static 리턴타입 메소드명() { } 도 추가할 수 있따.  ( jdk 1.8 이후) 
	작업지시서 역할을 수행한다.
	인터페이스는 상속(extends) 받지 않고, 구현(implements) 한다.
	상속도 받고 구현도 하면 = > 다중 강속의 효과를 낼 수 있따.
	
	여러 인터페이스의 다중 구현이 가능하다
	interface A { }
	interface B { }
	interface C implements A, B { }
	
*/