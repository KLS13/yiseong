package com.koreait.ex;

class Animal {
	public void move() {
		System.out.println("������ �����δ�");
	}
}

class Dog extends Animal{

	@Override
	public void move() {
		System.out.println("���� �޸���");
	}
}
class Dolphin extends Animal{

	@Override
	public void move() {
		System.out.println("������ ���ģ��");
	}
}

class Eagle extends Animal{

	@Override
	public void move() {
		System.out.println("�������� ����");
	}
	public void fly() {
		System.out.println("�������� ������ ���ƴٴ�");
	}
}

public class Ex03_polymorpshim {

	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Dog();
		animals[1] = new Dolphin();
		animals[2] = new Eagle();
		
		// animals[2].fly(); --> �θ�Ŭ������ fly �޼ҵ尡 ���⿡ ȣ�� �Ұ� 
		
		for(int i=0; i<animals.length; i++) {
			animals[i].move();
			
		}
		
		if(animals[2] instanceof Eagle) {
			Eagle eagle = (Eagle)animals[2];
			eagle.fly();
		}
		
		((Eagle)animals[2]).fly();
		
		//���� �޸���.
		//������ ���ģ��
		//�������� ����
	}

}
