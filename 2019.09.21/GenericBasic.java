//Generic0 에서 발견한 문제점들을 제네릭 기반의 클래스로 극복
class Apple{
	public String toString() {
		return "I am an apple";
	}
}
class Banana{
	public String toString() {
		return "I am a banana";
	}
}
//제네릭 기반의 클래스 -> T가 있는 자리에는 뭐든 옴  ( T 말고도 딴거 올수있지만 관례가 T임 )
class Box<T>{
	private T ob;
	
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {
		return this.ob;
	}
}
//문제점 : 모든 동작과 처리를 Object에 맞춰서 행할 수 밖에 없다.
// --> 그러나 제네릭 기반의 클래스로 문제 해결 가능

//제네릭 기반 클래스의 사용
public class GenericBasic {

	public static void main(String[] args) {
		Box<Apple> appleBox = new Box<Apple>(); //Box 클래스에서 T 부분을 모두 Apple로 바꾼 다음 객체 생성
		Box<Banana> bananaBox = new Box<Banana>(); //Box 클래스에서 T 부분을 모두 Banana로 바꾼 다음 객체 생성
		

	    appleBox.set(new Apple()); //명시했던 클래스의 객체만 넣을 수 있다는 문법적 규칙이 생김. 
	    bananaBox.set(new Banana());
	
	   
	    Apple ap = appleBox.get();
	    Banana bn = bananaBox.get();
	    //get을 했을 때 어떤 클래스의 인스턴스가 나올지는 정해져있따.
	    //따라서, 명시적 형변환이 전혀 필요하지않다.
	    
	    System.out.println(appleBox.get());
	    System.out.println(bananaBox.get());

	    //제네릭을 통해 얻을 수 있는 장점 
	    // 1. 코드 재사용 ( 클래스 여러개를 만들 필요가 없다 )
	    // 2. 실수(mistake)를 줄일 수 있다.

	}

}
