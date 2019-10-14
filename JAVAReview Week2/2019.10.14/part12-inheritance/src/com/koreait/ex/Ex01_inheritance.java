package com.koreait.ex;

// 부모클래스 (슈퍼클래스)
class Parent {
	
	// Field
	int number;
	
	// Method
	void doParent() {
		System.out.println("doParent() 호출");
	}
	
}

// 자식클래스 (서브클래스)
class Child extends Parent {
	
	// Method
	void doChild() {
		System.out.println("doChild() 호출");
	}
	
}

public class Ex01_inheritance {

	public static void main(String[] args) {

		// 자식클래스의 객체(인스턴스) 생성 및 사용
		Child child = new Child();
		
		child.number = 10;
		System.out.println(child.number);
		
		child.doParent();
		child.doChild();
		
	}

}
