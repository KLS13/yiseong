//자식 클래스의 생성자에서는 반드시 부모 클래스의 생성자 호출이 있어야 한다.
//만일, 사용자가 호출을 해주지 않으면, 자바가 알아서 자동적으로 호출

class Pig{
	String name;
	//생성자는, 정의되어있지 않을 시 자바가 자동적으로 만들어준다.
	Pig(String name){
		this.name = name;
	}
}
//부모클래스를 상속받을 때 생길 수 있는 문법적 강제성!
class BabyPig extends Pig{
	BabyPig(String name){
		super(name); // 부모 클래스의 생성자
	}
	
}
public class SuperConstructor {

	public static void main(String[] args) {
		

	}

}
