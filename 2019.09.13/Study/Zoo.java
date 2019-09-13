package Study;

class Animal{
	// toString는 Object클래스에 존재하는 메서드.
	public String toString() {
		return "동물";
	} // 문자열 형태로 출력하게끔 반환해줌!
}

class Pig extends Animal {
	// toString는 Object클래스에 존재하는 메서드.
	public String toString() {
		return "돼지";
	} // 문자열 형태로 출력하게끔 반환해줌!
	
}

class Tiger extends Animal {
	// toString는 Object클래스에 존재하는 메서드.
	public String toString() {
		return "호랑이";
	} // 문자열 형태로 출력하게끔 반환해줌!
	
}

class Rabbit extends Animal {
	public String toString() {
		return "토끼";
}

}
class ZooKeeper{
	//동물이 100종 이라면 ??
	// --??  feed를 100개 오버로딩??
	// NO. "다형성 이용"
	void feed(Tiger tiger) { // Tiger 클래스의 객체를 입력값으로 받겠다.
		System.out.println(tiger + "에게 먹이 주기!");
	}
	void feed(Pig pig) { // Tiger 클래스의 객체를 입력값으로 받겠다.
		System.out.println(pig + "에게 먹이 주기!");
	}
	void feed(Animal ani) {
		System.out.println(ani + "에게 먹이 주기!");
	} // 동일한 이름의 메서드가 있으면 참조변수가 아니라 참조된 객체의 메서드를 사용
	  //참조된 객체의 메서드를 사용
}


public class Zoo {

	public static void main(String[] args) {
		Animal ani = new Animal();
		System.out.println(ani);
		Pig pig1 = new Pig();
		Tiger tiger1 = new Tiger();
		Rabbit rab1 = new Rabbit();
		ZooKeeper zoo1 = new ZooKeeper();
		
		zoo1.feed(tiger1);   // 
		zoo1.feed(pig1);  
		// 
		zoo1.feed(rab1);   // 
	
		
		/*System.out.println(pig1);
		zoo1.feed();
		System.out.println(tiger1);
		zoo1.feed();
		// 이런식이면 코드 지저분.  feed에다가 객체를 전달! */
	}

}
