class Lion{
	String name;
	String Gender;
	int age;
	//세가지 인자를 받아서 초기화하는 생성자를 만들어보세요!
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
	//부모의 생성자는 자식의 생성자 첫줄에서 호출되어야 하게끔 되어있다.

	Simba(String name, String Gender, int age, String nation){
		super(name, Gender, age);
		 this.nation = nation;
	}
}
	


public class SuperPractice {

	public static void main(String[] args) {
		
		
		Simba sim = new Simba("심바", "수컷", 3,"Korea");
		
		sim.info();
	
		
		
		
		
	}

	}

