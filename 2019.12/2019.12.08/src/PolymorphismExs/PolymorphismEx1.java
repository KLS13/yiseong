package PolymorphismExs;

public class PolymorphismEx1 {
	public static void main(String[] args) {
		Super sp = new Super();
		System.out.println(sp.x + sp.y);
		sp.ss();
		
		Child ch = new Child();
		System.out.println(ch.z+ch.j);
		ch.ss();
		
		Super sp1 = new Child();
		System.out.println(sp1.x+sp1.y);
		//System.out.println(sp1.z+sp1.j);
		sp1.ss();
		
		//자식 타입의 참조변수 = new 부모인스턴스 생성 : 성립이 안된다.
		//Child ch1 = new Super();    
	}
}

class Super {
	int x=100;
	int y=200;
	public void ss(){
		System.out.println("부모 클래스");
	}
}

class Child extends Super{
	int z = 1000;
	int j = 2000;
	public void ss(){
		System.out.println("자식 클래스");
	}
}
