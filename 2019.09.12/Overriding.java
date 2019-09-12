class Cat{
	void eat() {
		System.out.println("와구와구");
	}//선언부와 정의부 구성

	void sleep() {
		
	}
}
class Babycat extends Cat{  
@Override // annotation 라고함. (@) 일종의 주석  생략가능

	void sleep() {
		
		super.sleep(); // 부모클래스의 sleep()을 그대로 사용.
		// 재정의 가능
	}

	//	void eat_baby() {   // 코드가 불필요하게 길어짐. 메서드 하나 늘어남
	//	System.out.println("냠냠");
	void eat() {
		System.out.println("냠냠");
	}
} //부모로부터 물려받은 메서드를 다시 정의하는 것.
// 오버로딩 : 메서드 이름은 같은데, 매개변수 형태가 다름
// 오버라이딩 : 상속받은 메서드를 그대로 선언하나, 정의는 다르게
public class Overriding {

	public static void main(String[] args) {
		Cat tom = new Cat();
		tom.eat();
		
		Babycat tommy = new Babycat();
		tommy.eat();
	}

}


