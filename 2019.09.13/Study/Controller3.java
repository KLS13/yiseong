package Study;

class Car{
	final int numOfWheel = 4;
	
	void accel() {
		System.out.println("�ξƾ�");
	}
}
class SportCar extends Car{

	@Override
	void accel() {
		System.out.println("�ξƾƾƾƾ�!");
		
	}
	
}
// final : �޼����� ���ȭ, Ŭ������ ���ȭ ����
public class Controller3 {

	public static void main(String[] args) {
		Car car = new Car();
		//car.numOfWheel
		

	}

}
