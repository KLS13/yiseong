//인터페이스 : 상호작용을 하기 위한 일종의 규약

//냉장고
//--> 냉장,냉동,채소칸,생선칸, 외부 버튼별 기능 ( 반드시있어야 하는 기능들 존재)
// 이런 것들을 인터페이스로 규정

interface Refri{
 // 상수,메서드 들어갈 수 있습니다.
	int temper = -5; // public static final int
	void openDoor(); // public abstract void
	// 제어자는 생략주어도 알아서 붙는다.
}
// 위의 인터페이스를 기반으로 만든 클래스는 temper가 무조건 -5 이고
// opendoor 메서드를 반드시 정의해야함.
// 즉, 이 또한 문법적 강제성이다.

//인터페이스는 상속이라는 표현 안쓰고, 구현(implements)이라는 표현 씁니다 !
class LGRefri implements Refri{
	
	// 인터페이스로부터 부여되는 강제성 :
	// 접근제어자 public, 추상메서드 구현에 대한 강제성
	public void openDoor() {
		System.out.println("냉장고 문이 열리네요~");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
