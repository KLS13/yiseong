
//메서드도 클래스의 멤버
//static 사용시 객체생성없이 사용가능
class Case{
	//1. 입력값과 결과값이 모두 있는 경우
	double addThree(double a, double b, double c) {
		return a+b+c;
		// 이런 경우 연산을 먼저 한 다음에 리턴함.
	}
	// 2. 입력값은 있는데 결과값이 없는 경우
	static void urValue(String str) {
		System.out.println(str);
	}
	// 3. 입력값은 없는데 결과값이 있는 경우
	int returnTen() {
		return 10;
	}
	// 4. 입력값도 결과값도 없는 경우
	void say() {
		System.out.println("메서드를 !");
		System.out.println("하고나니 !");
		System.out.println("자바할맛 !");
		System.out.println("정말안나 !");
	}
}

public class FourCase {

	public static void main(String[] args) {
		
		

		Case.urValue("배울게 참 많다"); //static 사용시 객체생성없이 사용가능
		
		//클래스 멤버로는 변수와 메서드가 존재하는데,
		//얘네들 두고 '클래스의 멤버다' 라고 표현한다.
		//멤버의 종류로는 인스턴스멤버, 클래스 멤버가 있습니다.

	}

}
