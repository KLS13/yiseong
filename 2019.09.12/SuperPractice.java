class Lion{
	String name;
	String Gender;
	int age;
	//������ ���ڸ� �޾Ƽ� �ʱ�ȭ�ϴ� �����ڸ� ��������!
	Lion(String name, String Gender, int age){
		this.name = name;
		this.Gender = Gender;
		this.age = age;
	}
	void info() {
	
		System.out.print(this.name);
		System.out.print(this.Gender);
		System.out.print(this.age);
	}
}

class Simba extends Lion{
	String nation;
	@Override
	void info() {
		super.info();
		 System.out.println(nation);
	}
	//�θ��� �����ڴ� �ڽ��� ������ ù�ٿ��� ȣ��Ǿ�� �ϰԲ� �Ǿ��ִ�.

	Simba(String name, String Gender, int age, String nation){
		super(name, Gender, age);
		 this.nation = nation;
	}
}
	


public class SuperPractice {

	public static void main(String[] args) {
		
		
		Simba sim = new Simba("�ɹ�", "����", 3,"Korea");
		
		sim.info();
	
		
		
		
		
	}

	}

