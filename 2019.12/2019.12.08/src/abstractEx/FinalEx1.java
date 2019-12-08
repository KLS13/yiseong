package abstractEx;

public class FinalEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Super{
	public void method(){
		System.out.println("수퍼 클래스");
	}
	
	final public void method1(){
		System.out.println("final 테스트");
	}
}

final class Sub extends Super {
	public void method(){
		System.out.println("서브 클래스");
	}
// Super class에 있는  final 메소드는 오버라이딩을 할 수 없다.!!! 
//	public void method1(){
//		System.out.println("final 테스트 2");
//	}
}


//class Subsub extends Sub{
//	
//}
