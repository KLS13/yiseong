package com.koreait.test;
/*
Test01.java

����Ʈ�� => ��ȭ + ��ǻ��

class Phone { }
class Computer { }
+
class SmartPhone extends Phone, Computer { }  �Ұ���!

------------------

class Phone { }				�޼ҵ� : Constructor, sendCall(), receiveCall()
interface Computable { }	�޼ҵ� : connectInternet(), playApp()
+
class SmartPhone extends Phone implements Computable { }
*/
interface Computable {
	void connectInternet();
	void playApp();
}
class Phone { 
	private String owner;
	
	public Phone(String owner) {
		this.owner = owner;
		
	}
	
	public void sendCall() {
		System.out.println(owner + "��ȭ �ɱ�");
	}
	public void receiveCall() {
		System.out.println(owner + "��ȭ �ޱ�");
	}
}

class SmartPhone extends Phone implements Computable {
	public SmartPhone(String owner) {
		super(owner);
	}
	@Override
	public void connectInternet() {
		System.out.println("���ͳ� ����");
	}
	public void playApp() {
		System.out.println("�� ����");
	}

}
public class Test01 {

	public static void main(String[] args) {
		
		SmartPhone phone = new SmartPhone("alice");
		
		phone.sendCall();
		phone.receiveCall();
		phone.playApp();
		phone.playApp();

	}

}
