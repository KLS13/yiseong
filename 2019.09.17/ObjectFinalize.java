class Person{
	
	String name;
	
	public Person(String name) {
		this.name = name;
	} // 객체가 소멸될 때 호출되는 finalize() 
	

	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("destroyed : " + name);
	}
}
//자바는 가비지 컬렉션을 지원함.
// --> 메모리를 정리해줌 (불필요한 것들을 치워줌)

//Memory Managed Language : 메모리 관리를 직접 안해도 되는 언어
//  --> 자바, 파이썬, 자바스크립트  등
//Memory unManaged Language : 메모리 관리를 직접 해야되는 언어
//  --> C언어, C++
public class ObjectFinalize {

	public static void main(String[] args) {
		Person p1 = new Person("Kang");
		Person p2 = new Person("Park");
		//null : 데이터가 존재하지 않는다는 의미
		p1 = null; // 가비지 컬렉션의 대상이 될 수 있다.
		p2 = null; // 가비지 컬렉션의 대상이 될 수 있다.
		//위와 같이 되면, 메모리만 차지하는 불필요한 변수가 됨
		
		System.gc(); // 필요없는 애들을 모아놓음
		System.runFinalization(); //모아놓은 애들의 finalize를 run시켜라
		
		System.out.println("end of program");
		

	}

}
