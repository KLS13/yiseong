package com.koreait.ex;
// �������̽��� :  ~~ �� �� �ִ�
interface Eatable {
	void eat();
}

class My {
	public void dirty() {
		System.out.println("���� ������.");
	}
}

class Apple extends My implements Eatable {
	@Override
	public void eat() {
		System.out.println("����� ��ħ�� �Դ°��� ����");
	}
}

class Banana extends My implements Eatable {
	@Override
	public void eat() {
		System.out.println("�ٳ��� ������ ����� ���ÿ�");
	}
}

class Computer extends My {
	
}
public class Ex03_interface {

	public static void main(String[] args) {
		
		My[] list = new My[3];
		
		list[0] = new Apple();
		list[1] = new Banana();
		list[2] = new Computer();
		
		for(int i = 0; i<list.length; i++) {
			list[i].dirty();
			if(list[i] instanceof Eatable) {
			((Eatable)list[i]).eat();
			}
		}

	}

}
