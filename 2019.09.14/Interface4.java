// 인터페이스의 다형성을 어떤 식으로 응용하면 좋을까?
interface AA{
	void helloA();
}

interface BB{
	void helloB();
}
//다중 구현을 하는 클래스 AB 정의

class AB implements AA,BB{
	public void helloA() {
		System.out.println("A입니다. 안녕하세요");
	}
	public void helloB() {
		System.out.println("B입니다. 안녕하세요");
	}
}
public class Interface4 {

	public static void main(String[] args) {
		AB ab = new AB();
		
		AA aa = new AB(); // AA인터페이스 참조변수는 자기를 구현하는 AB클래스의 객체를 참조할수 있음.
		// AB 객체를 AA 인터페이스 기반으로 사용하겠다 !
		BB bb = new AB();
		
		aa.helloA();
		// aa.helloB();  오류
		bb.helloB();

	}

}
