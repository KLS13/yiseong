package Study;

class AAA{
	void method1() {
		System.out.println("나는 1번");
	}
	void method2() {
		System.out.println("나는 2번");
	}
}
class BBB extends AAA {
	void method3() {
		System.out.println("나는 3번");
	}
}

public class Poly2 {

	public static void main(String[] args) {
	
		AAA a1 = new BBB();
		//a1 : 나는 메서드1과 메서드2를 가지고 있어야해 !
		//그런데 BBB 객체에는 둘 다 있네? 그럼 참조가능해!
		//a1.method3(); // a1 : 참조한다고 했지 객체의 모든 멤버를 사용한다곤 안함  사용못함.

	}

}
