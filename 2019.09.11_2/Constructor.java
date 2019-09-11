class Person{
	String name;
	int age;
	int height;
	// 생성자 만드는 법 : 클래스명과 이름이 동일. 반환타입없음
	
	Person(String name, int age, int height){
		System.out.println("생성자 호출됐다!");
		this.name = name;
		this.age = age;
		this.height = height;
		//생성자
		//생성자는 주로 초기화 작업(멤버 변수에 대한)에 쓰임.
	}// 클래스에는 '반드시' 생성자가 하나 이상 존재
	// 그런데 만일, 사용자가 생성자를 만들어 주지 않으면
	// 자바가 알아서 생성자를 추가
	
	//단, 자바가 알아서 추가하는 생성자는 아무 기능도 없슴.
}
// 생성자는 객체가 생성될 때 '반드시' 호출됨.
// 생성자 또한 각각의 객체마다 독립적으로 호출된다.
public class Constructor {

	public static void main(String[] args) {
		Person per1 = new Person("박",30,180);
		Person per2 = new Person("이",29,169);
		
;
	// 생성자가 입력값을 받아서 각각의 멤버 변수에 초기화해줄것.
	
		// ?? : 모든 멤버 변수값을 초기화해줘
		// 3명 말고 10명 더추가해줘
		// ---> 생성자를 사용하면 코드를 줄일수 있따
		
		

	}

}
