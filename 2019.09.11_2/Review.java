// 객체 : 사람이나 사물 등을 소프트웨어적으로 구현한 것.
// 객체 지향 방식 : 객체들이 상호작용하면서 프로그램을 구성하는 것.
// 클래스 : 객체를 만들기 위한 설계도
// 인스턴스 멤버 : 객체마다 독립적으로 가지는 고유한 멤버
// 일반적인 방식으로 정의.
// 클래스 멤버 : 객체들이 공유하는 멤버
// static 이라는 키워드 사용

class Cat{
	/* 멤버 변수 (속성) */
	/* 메서드(멤버로 오는 함수, 기능담당) */
	String name;
	int age;
    //클래스 변수
	static int numofTail; // static 사용으로 인한 효과 - 객체 생성하지 않아도 접근 가능
	
	void nothing() {
		System.out.println("그릐르릉릥");
	}
	void angry() {
		System.out.println("하아아각!");
	} 
	//이름과 나이를 초기화하는 메서드도 만들 수 있다.
	void init(String str, int num) {
		name = str;
		age = num;
		// 클래스 내부에서는 메서드가 멤버 변수에 접근할 수 있다.
	}
	void introduce() {
		System.out.println("저는 " + name + "입니다." + "나이는" + age);
	}
}
// 설계도가 있다고 해서, 객체가 있는 것은 아니다.
// 객체를 생성해주어야 비로소 진짜 객체로써 존재할 수 있따.

public class Review {


	public static void main(String[] args) {
		Cat.numofTail = 1;
		
		Cat tom = new Cat();
		Cat dor = new Cat();
		// tom 이라는 참조 변수는 Cat 클래스의 인스턴스를 의미한다.
		// 참조변수 : 메모리 주소를 저장하는 변수
		
		tom.init("톰",5); // 이름은 톰, age는 5
		tom.introduce();

		System.out.println(dor.numofTail);
		System.out.println(tom.numofTail);
		/*tom.age = 3;
		tom.name = "톰";
		tom.angry();
		tom.nothing();
		System.out.println(tom.age + "살" + ", 이름 : " + tom.name); */
		
	}

}
