//객체를 보관하는 클래스 Box !
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

class Box{
	private Object ob;
	
	public void set(Object ob) {
		this.ob = ob;
	}
	public Object get() {
		return this.ob;
	}
}

//아래와 같은 방식은 실수를 유발할 가능성이 무척 큼
//제네릭이 있다면 극복 가능
public class Generic0 {

	public static void main(String[] args) {
		
		Box appleBox = new Box();
		Box bananaBox = new Box();
		

	   //  appleBox.set("사과"); // 에러 발생X
	    appleBox.set(new Apple());
	    bananaBox.set(new Banana());
		//public void set(Object ob = new Apple();
		//다형성의 정의가 적용되었다.  자식 클래스 객체를 참조할 수 있음..
	    
	    Apple ap = (Apple)appleBox.get();
	    // --> Apple ap = Object; < 다형성의 정의가 적용안됨
	    //안되는걸 되게... 명시적 형변환
	    // 명시적 형변환 일일이 해주긴  귀찮. 실수유발
	    Banana bn = (Banana)bananaBox.get();
	    
	    System.out.println(appleBox.get());
	    System.out.println(bananaBox.get());
	}
}

