package com.koreait.ex;

// �θ�Ŭ���� (����Ŭ����)
class Parent {
	
	// Field
	int number;
	
	// Method
	void doParent() {
		System.out.println("doParent() ȣ��");
	}
	
}

// �ڽ�Ŭ���� (����Ŭ����)
class Child extends Parent {
	
	// Method
	void doChild() {
		System.out.println("doChild() ȣ��");
	}
	
}

public class Ex01_inheritance {

	public static void main(String[] args) {

		// �ڽ�Ŭ������ ��ü(�ν��Ͻ�) ���� �� ���
		Child child = new Child();
		
		child.number = 10;
		System.out.println(child.number);
		
		child.doParent();
		child.doChild();
		
	}

}
