package abstractEx;

public class FinalEx1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
}

class Super{
	public void method(){
		System.out.println("���� Ŭ����");
	}
	
	final public void method1(){
		System.out.println("final �׽�Ʈ");
	}
}

final class Sub extends Super {
	public void method(){
		System.out.println("���� Ŭ����");
	}
// Super class�� �ִ�  final �޼ҵ�� �������̵��� �� �� ����.!!! 
//	public void method1(){
//		System.out.println("final �׽�Ʈ 2");
//	}
}


//class Subsub extends Sub{
//	
//}
