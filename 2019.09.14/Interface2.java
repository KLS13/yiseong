//자바는 다중상속 허용하지않음
// 부모는 한클래스만 존재
// 그러나 상속과 구현은 동시에 가능

class Animal{
	String species;
	
	void setSpecies(String species) {
		this.species = species;
	}
	void info() {
		System.out.println("저는" + this.species + " 입니다");
	}
}
//조류, 어류, 곤충류, 맹금류, 기타 등등

interface Bird{
	int numOfwings = 2;  // public static final int 
	void fly(); //public abstract void
}
interface Beast{
	int numOfwings = 4 ;
	void hunt();
}
////////////////////////////////////////////////////////////////
interface elec{
	
}
class PC implements elec{
	
}
////////////////////////////////////////////////////////////////

class Eagle extends Animal implements Bird{
	//Eagle 은 Animal 을 상속받으면서 동시에 Bird를 구현
	public void fly() {
		System.out.println("독수리가 난다 !");
	} // 인터페이스의 메서드를 구현할 때는 접근제어자도 같이 !
	
	void moreInfo() {
		System.out.println("날개는 " + numOfwings + "개 입니다");
	}
}

class Tiger extends Animal implements Beast{
	//Eagle 은 Animal 을 상속받으면서 동시에 Bird를 구현
	public void hunt() {
		System.out.println("호랑이가 어흥 !");
	} // 인터페이스의 메서드를 구현할 때는 접근제어자도 같이 !
	
	void moreInfo() {
		System.out.println("다리는 " + numOfwings + "개 입니다");
	}
}
public class Interface2 {

	public static void main(String[] args) {
		///////////////////////////////////////////////////////////////
		PC pc = new PC();
		elec el = new PC();
		//다형성의 정의는 인터페이스에도 적용이 된다.
		//참조 변수는 자기 자신의 클래스 형 또는 상속 관계에서 자신보다 아래에 있는 클래스 형 객체를 모두 참조할 수 있따.
		//--> 인터페이스를 구현한 클래스는 인터페이스의 자식이라고 할 수 있따.
		///////////////////////////////////////////////////////////////
		Eagle hanhwa = new Eagle();
		hanhwa.setSpecies("독수리");
		hanhwa.info();
		hanhwa.moreInfo();
		hanhwa.fly();
		
		Tiger ti = new Tiger();
		 ti.setSpecies("호랑이");
		 ti.info();
		 ti.moreInfo();
		 ti.hunt
		 ();
	}

}
