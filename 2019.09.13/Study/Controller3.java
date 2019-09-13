package Study;

class Car{
	final int numOfWheel = 4;
	
	void accel() {
		System.out.println("부아앙");
	}
}
class SportCar extends Car{

	@Override
	void accel() {
		System.out.println("부아아아아앙!");
		
	}
	
}
// final : 메서드의 상수화, 클래스의 상수화 가능
public class Controller3 {

	public static void main(String[] args) {
		Car car = new Car();
		//car.numOfWheel
		

	}

}
