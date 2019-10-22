package com.koreait.test;
/* 		interface Car		info();
 * 
 * 				 ��			== implements ==
 * 
 * 			Bus		Taxi	info(){ }   �ʼ�
 * 
 * 			 ��				== extends ==
 * 
 * 			SeoulBus		info(){ }   ����
 * 			CityTourBus
 */


interface Car {
	// �������̽��� �߻�޼ҵ常 ���� �� �ִ�.
	public abstract void info();
}


class Bus implements Car {
	
	// �������̽��� ����(implements)�ϴ� Ŭ������
	// �������̽��� ��� �߻�޼ҵ带 �ݵ�� �������̵�(������ ������� ���ۼ�) �ؾ� �Ѵ�.
	@Override
	public void info() {
	}
}

class SeoulBus extends Bus {
	
	// Ŭ������ ���(extends)�޴� Ŭ������
	// super Ŭ������ Ư�� �޼ҵ带 �ʿ��� ��� �������̵� �� �� �ִ�.
	
	@Override
	public void info() {
		System.out.println("�������");
	}
}
class CityTourBus extends Bus {

	@Override
	public void info() {
		System.out.println("��Ƽ����");
	}
}
class Taxi implements Car {
	@Override
	public void info() {
		System.out.println("�ý�");
	}
}
class Bicycle { }
public class Test03 {

	//static void onlyCar(Car car) {
		// (SeoulBus)car    �Ź� ĳ���� �������~~
	
	static <T extends Car> void onlyCar(T car) {
		// <Car�ȿ� �ִ� �͸� ���Ե�(��ӵ�)>  ���׸� ó���ϸ� �ٿ� ĳ���� ���ʿ�    �� ���̽�Ŭ�� �ȵ� ! 
		car.info();
	}
	public static void main(String[] args) {

		Car bus1 = new CityTourBus();
		Bus bus2 = new SeoulBus();
		Car taxi = new Taxi();
				
		onlyCar(bus1);	// ��Ƽ�������
		onlyCar(bus2);	// �������
		onlyCar(taxi);	// �ý�

		Bicycle cycle = new Bicycle();
	//	onlyCar(cycle);	// �����ϸ� �� ��
		
	}

}
