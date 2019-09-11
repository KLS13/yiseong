

class Dog{
	// 속성 : 이름, 견종, 나이
	String name;
	String breed;
	int age;
	
	void bark() {
		System.out.println("멍멍");
	}
	void eat(String food) {
		System.out.printf("%s 먹기! %n", food);
	}
	void hello(String person) {
		if(person.equals("주인")) {
			System.out.println("반가워요 주인님 ");
		}else if(person.equals("도둑")) {
			System.out.println("으르렁 으르렁");
		}else {
			System.out.println("---------");
		}
	}

	// 기능 : 짖기, 먹기, 사람 맞이하기
	}

public class DogSample {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		dog1.name = "흰둥이";
		dog1.breed = "푸들";
		dog1.age = 30;
		
		System.out.println("이름은 " + dog1.name + ", 견종은 " +
		                   dog1.breed +", 나이는 " + dog1.age);
		dog1.bark();
		dog1.eat("사료");
		dog1.eat("간식");
		dog1.hello("주인");
		dog1.hello("도둑");
		dog1.hello("훈이");
		

	}

}
