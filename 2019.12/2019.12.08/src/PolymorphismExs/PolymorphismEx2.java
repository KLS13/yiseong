package PolymorphismExs;

public class PolymorphismEx2 {
	public static void main(String[] args) {
		Car car = null;
		
		FireEngine fe = new FireEngine();
		fe.water();
		Truck tr = new Truck();		
		tr.sand();
		
//		fe = (FireEngine)tr; //상속관계가 아니기 때문에 형변환을 할 수가 없다
		
		car = fe; // 업캐스팅 : 자식 --> 부모타입으로 변환 :캐스팅을 생략
		// car.water();
		
		fe = (FireEngine)car; // 다운 캐스팅 : 부모 -->자식으로 형변환
		fe.water();		
	}
}

class Car{
	String color;
	int door;
	
	public void accel(){
		System.out.println("운전!!!");
	}
	
	public void breakdown(){
		System.out.println("정차!!!");
	}
}

class FireEngine extends Car{
	void water(){
		System.out.println("물 발사!!!");
	}
}

class Truck extends Car{
	void sand(){
		System.out.println("모래를 담는다.");
	}
}













