//상속을 하는애 :  부모,기초,슈퍼 클래스  ||  상속을 받는애 : 자식, 유도, 서브 클래스
// "자바" 에서는  '단일 상속' 만을 허용. -->  하나의 자식클래스가 하나의 부모 클래스만을 상속받음
// 다른 객체 지향 언어에서는 다중 상속 가능
// 하나의 부모클래스가 여러 자식 클래스를 만드는 것은 가능
class Person{
	String name;
	
	Person(String name){
		System.out.println("사람이 생성됨!");
		this.name = name;
	}
	Person(){
		System.out.println("무명의 사람이 생성됨!");
		this.name = "무명";
	}
	void sleep() {
		System.out.println(this.name + "은 드르렁~ ~ ~");
	}
	
}
	class Student extends Person{
		Student(String name){
			this.name = name;
		}
	}

public class Review {

	public static void main(String[] args) {

/*		Person per1 = new Person("박재범");
		Person per2 = new Person();
		per1.sleep();
		per2.sleep();
		//per1.name = "강동원";   */
		
		Student stu1 = new Student("박재범");  // 생성자는 상속되지않기 때문에 class Student 에서 다시한번 작성.
		stu1.sleep();   
	}

}
