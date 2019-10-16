package com.koreait.test;
/*
Test01.java

스마트폰 => 전화 + 컴퓨터

class Phone { }
class Computer { }
+
class SmartPhone extends Phone, Computer { }  불가능!

------------------

class Phone { }				메소드 : Constructor, sendCall(), receiveCall()
interface Computable { }	메소드 : connectInternet(), playApp()
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
		System.out.println(owner + "전화 걸기");
	}
	public void receiveCall() {
		System.out.println(owner + "전화 받기");
	}
}

class SmartPhone extends Phone implements Computable {
	public SmartPhone(String owner) {
		super(owner);
	}
	@Override
	public void connectInternet() {
		System.out.println("인터넷 연결");
	}
	public void playApp() {
		System.out.println("앱 실행");
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
