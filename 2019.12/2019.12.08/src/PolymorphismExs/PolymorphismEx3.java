package PolymorphismExs;

public class PolymorphismEx3 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		
		Truck tr = null;		
		
		car.accel();
		
		// tr =(Truck)car; 에러가난다. 자손타입으로 부모의 인스턴스를 참조 할 수 없다.
		//tr.accel();
		
		car2 = tr; // 업캐스팅
		// car2.accel();	
		
	}

}


















