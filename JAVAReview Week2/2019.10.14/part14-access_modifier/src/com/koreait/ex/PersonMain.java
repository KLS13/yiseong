package com.koreait.ex;

public class PersonMain {

	public static void main(String[] args) {

		Person woman = new Person();
		Person man = new Person("james", 20, 175.5, '��');
		
		// woman.name = "alice";  private ó���Ǿ��� ������ ��� Field�� ���� ������ �� ��!
		woman.setName("alice");   // public ó���� �޼ҵ� setName �� ���� ��ȸ ���ٸ� ����!
		woman.setAge(20);
		woman.setHeight(168.5);
		woman.setGender('��');
		
		System.out.println("���� : " + woman.getName());
		System.out.println("���� : " + woman.getAge());
		System.out.println("���� : " + woman.getHeight());
		System.out.println("���� : " + woman.getGender());
		
		System.out.println("���� : " + man.getName());
		System.out.println("���� : " + man.getAge());
		System.out.println("���� : " + man.getHeight());
		System.out.println("���� : " + man.getGender());
		
	}

}
