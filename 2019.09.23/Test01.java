import java.util.HashSet;

class Person {



	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
}

	public String toString() {
	return name + "(" + age + "��)";
}
	@Override
	public int hashCode() {
		return age%7;
	}
	//��ü���� ��(equals)�� �⺻������ �޸� �ּ� ���� ���̱� ������,
	//���� ���� �� �ְԲ� equals�� ������
	//���� �̷��� ��Ƚ���� �ٿ� ���α׷��� ȿ���� ���̱� ���ؼ�
	//�ؽ��ڵ��� ���� �����.
	public boolean equals(Object obj) {

	Person p = (Person) obj;
		if(p.name.equals(name) && p.age == age) {
			return true;
		}else {
			return false;
		}	
	}	
}
//�̸��� ���̰� ������ �ߺ�  �ؽ��¿� X

public class Test01 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Person> hSet = new HashSet<Person>();
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("LEE", 10));
		hSet.add(new Person("PARK", 35));
		hSet.add(new Person("PARK", 35));
		
		System.out.println("����� ������ �� : " + hSet.size());
		System.out.println(hSet);

	}

}
