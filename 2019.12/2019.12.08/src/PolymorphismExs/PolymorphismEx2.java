package PolymorphismExs;

public class PolymorphismEx2 {
	public static void main(String[] args) {
		Car car = null;
		
		FireEngine fe = new FireEngine();
		fe.water();
		Truck tr = new Truck();		
		tr.sand();
		
//		fe = (FireEngine)tr; //��Ӱ��谡 �ƴϱ� ������ ����ȯ�� �� ���� ����
		
		car = fe; // ��ĳ���� : �ڽ� --> �θ�Ÿ������ ��ȯ :ĳ������ ����
		// car.water();
		
		fe = (FireEngine)car; // �ٿ� ĳ���� : �θ� -->�ڽ����� ����ȯ
		fe.water();		
	}
}

class Car{
	String color;
	int door;
	
	public void accel(){
		System.out.println("����!!!");
	}
	
	public void breakdown(){
		System.out.println("����!!!");
	}
}

class FireEngine extends Car{
	void water(){
		System.out.println("�� �߻�!!!");
	}
}

class Truck extends Car{
	void sand(){
		System.out.println("�𷡸� ��´�.");
	}
}













