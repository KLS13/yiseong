package com.koreait.test;
/* 		interface Car		info();
 * 
 * 				 ↑			== implements ==
 * 
 * 			Bus		Taxi	info(){ }   필수
 * 
 * 			 ↑				== extends ==
 * 
 * 			SeoulBus		info(){ }   선택
 * 			CityTourBus
 */


interface Car {
	// 인터페이스는 추상메소드만 가질 수 있다.
	public abstract void info();
}


class Bus implements Car {
	
	// 인터페이스를 구현(implements)하는 클래스는
	// 인터페이스의 모든 추상메소드를 반드시 오버라이드(동일한 모습으로 재작성) 해야 한다.
	@Override
	public void info() {
	}
}

class SeoulBus extends Bus {
	
	// 클래스를 상속(extends)받는 클래스는
	// super 클래스의 특정 메소드를 필요한 경우 오버라이드 할 수 있다.
	
	@Override
	public void info() {
		System.out.println("서울버스");
	}
}
class CityTourBus extends Bus {

	@Override
	public void info() {
		System.out.println("시티투어");
	}
}
class Taxi implements Car {
	@Override
	public void info() {
		System.out.println("택시");
	}
}
class Bicycle { }
public class Test03 {

	//static void onlyCar(Car car) {
		// (SeoulBus)car    매번 캐스팅 해줘야함~~
	
	static <T extends Car> void onlyCar(T car) {
		// <Car안에 있는 것만 포함된(상속된)>  제네릭 처리하면 다운 캐스팅 불필요    즉 바이시클은 안됨 ! 
		car.info();
	}
	public static void main(String[] args) {

		Car bus1 = new CityTourBus();
		Bus bus2 = new SeoulBus();
		Car taxi = new Taxi();
				
		onlyCar(bus1);	// 시티투어버스
		onlyCar(bus2);	// 서울버스
		onlyCar(taxi);	// 택시

		Bicycle cycle = new Bicycle();
	//	onlyCar(cycle);	// 동작하면 안 됨
		
	}

}
