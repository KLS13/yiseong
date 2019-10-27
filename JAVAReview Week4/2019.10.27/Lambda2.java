interface Cellphone{
	void RingRing();
}
//목표 : Cellphone을 구현하는 클래스를 따로 만들지 않고도 객체 생성 및 사용할 수 있다.
public class Lambda2 {

	public static void main(String[] args) {
		Cellphone cp = ( ) -> {
		// 컴파일러는 매개변수 타입과 개수를 알고 있다!   아니까 안 써줌
		// 컴파일러는 정의해야하는 메소드명을 알고 있다.  아니까 안 써줌
		// 컴파일러는 정의해야하는 메소드 개수도 알고있다. 아니까 안써줌
		System.out.println("람다 개꿀~");
	};

	cp.RingRing();
	}
}
