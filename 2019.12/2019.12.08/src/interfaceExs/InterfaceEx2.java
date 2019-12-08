package interfaceExs;

interface Interface1{
	void aa();
}

interface Interface2 {
	void bb();
}

// interface끼리 상속을 할경우에는 extends 사용, 
// 인터페이스는 다중상속이 가능하다.
interface Interface3 extends Interface1, Interface2{
	void cc();
}

class Super{
	public void ss(){
		System.out.println("하이");
	}
}

class B extends Super implements Interface3{
	public void aa() {}
	public void bb() {}	
	public void cc() {}
}


public class InterfaceEx2 {
	public static void main(String[] args) {
	}

}
