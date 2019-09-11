//클래스 : 객체를 만들기 위한 설계도 ( 속성과 기능으로 구성 )
//인스턴스 : 설계도를 통해 실질적으로 만들어진 형태
// EX) 장화만드는 틀: 클래스    장화: 객체  
//  -->장화는 장화 만드는 틀의 인스턴스이다.
// EX) 붕어빵틀(클래스), 붕어빵(객체), 붕어빵은 붕어빵틀의 인스턴이다.
class Person {
	/* 속성(변수)  : 이름, 나이  */
	String name;
	int age;
	//인스턴스 변수들! --> 객체마다 독립적으로 가지는 고유의 속성
    /*기능(메서드) :   */
	//메서드란? 클래스 멤버함수 ( 주로 클래스의 기능을 담당 )
	// →→→   입력값 -> 처리 -> 출력값
	static int numofHeart; // 모든 객체가 공유가능. static이 붙은 클래스 변수
	                       // --> 객체를 생성하지 않아도 접근할 수 있다.
	
	void say() {
		System.out.println("나는 말을 한다.");
	}
	void singing() {
		System.out.println("좋으니 사랑해서~~");
	}
	void pushUp(int num) {
		for(int i=0; i<num; i++) {
			System.out.println("팔굽혀펴기" + (i+1) + "개 째!");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		Person.numofHeart = 1; // 객체 생성 전에 접근을 했음.
		
		
		
		Person boy = new Person();
		//Person 클래스로 boy라는 객체를 만들었다!
		// => boy는 Person 클래스의 인스턴스
		int num=3; //(num은 인트형의 변수), 기본 자료형으로 만든 변수.
		Person girl = new Person(); 
		/* girl은 Person형의 참조변수다.  변수 : 데이터를 저장하는 상자
		                                                       참조변수 : 데이터를 저장하는 상자의 주소를 저장하는 상자  */
		
		boy.name = "차은우";
		boy.age = 25;
		girl.name = "아이린";
		girl.age = 20;
		//  . 을 찍는다는것은 참조변수가 저장하고 있는 주소에 접근하겠다는 뜻.
		// 각각의 객체는 같은 클래스로 만들었어다고해도 --> 독립적이다.
		System.out.println("나이는" + boy.age + ", 이름은 " + boy.name);
		System.out.println("나이는" + girl.age + ", 이름은 " + girl.name);
		System.out.println("심장의 개수는 " + girl.numofHeart + ", 나이는" + girl.age + ", 이름은 " + girl.name);
		System.out.println("심장의 개수는 " + boy.numofHeart + ", 나이는" + boy.age + ", 이름은 " + boy.name);
		boy.numofHeart=300; // 클래스 변수는 같은 변수를 공유하므로, 어떻게 접근해서 바꾸든 모두에게 적용(메모리 공간 절약)
		System.out.println("심장의 개수는 " + girl.numofHeart);
		System.out.println("심장의 개수는 " + boy.numofHeart);
	
		//////////////////////////////////////////////////////////////////
		
		Person per1 = new Person();
		Person per2 = new Person();
		
		per1.name = "강원래";
		per1.age = 40;
		
		per2.name = "구준엽";
		per2.age = 40;
		
		per1.say();
		per2.singing();
		per1.pushUp(5);
		
	}

}
