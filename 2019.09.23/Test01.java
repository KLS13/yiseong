import java.util.HashSet;

class Person {



	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
}

	public String toString() {
	return name + "(" + age + "세)";
}
	@Override
	public int hashCode() {
		return age%7;
	}
	//객체간의 비교(equals)는 기본적으로 메모리 주소 간의 비교이기 때문에,
	//값을 비교할 수 있게끔 equals를 재정의
	//또한 이러한 비교횟수를 줄여 프로그램의 효율을 높이기 위해서
	//해쉬코드라는 것을 사용함.
	public boolean equals(Object obj) {

	Person p = (Person) obj;
		if(p.name.equals(name) && p.age == age) {
			return true;
		}else {
			return false;
		}	
	}	
}
//이름과 나이가 같으면 중복  해쉬셋에 X

public class Test01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));
		
		System.out.println("저장된 데이터 수 : " + hSet.size());
		System.out.println(hSet);

	}

}
