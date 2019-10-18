package com.koreait.ex;

class Computer {
	
	private String model;
	private int price;
	
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	@Override
	public String toString() {
		String info = "�� : " + model + ", ���� : " + price + "��";
		return info;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Computer) {
			return model.equals(((Computer)obj).model) && price == ((Computer)obj).price;
		} else {
		return false;
		}
	}
}

public class Ex02_Object {

	public static void main(String[] args) {
		Computer com1 = new Computer("�Ｚ����",100 );
		Computer com2 = new Computer("�Ｚ����",100 );
		System.out.println(com1);
		System.out.println(com2);
		
		if(com1 == com2) {
			System.out.println("���� ������ ��ǻ��");
		}else {
			System.out.println("�ٸ�����");;
		}
		// 2. equals
		// 1) Object �� equals �޼ҵ� : ��ü �� �Ұ� !
		// 2) Computer Ŭ������ equals �޼ҵ� �������̵� �ϸ� : ��ü �� ����!
		
		if(com1.equals(com2)) {
			System.out.println("���� ������ ��ǻ��");
		}else {
			System.out.println("�ٸ�����");;
			
		}
		

	}

}
