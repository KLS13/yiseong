package PolymorphismExs;

public class PolymorphismEx3 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		
		Truck tr = null;		
		
		car.accel();
		
		// tr =(Truck)car; ����������. �ڼ�Ÿ������ �θ��� �ν��Ͻ��� ���� �� �� ����.
		//tr.accel();
		
		car2 = tr; // ��ĳ����
		// car2.accel();	
		
	}

}


















