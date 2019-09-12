//자바에 존재하는 모든 클래스들은 Object 클래스를 상속받음.
class Soccer{
	String position;
	String nation;

	void kick() {
		System.out.println("발로 차");
	}
}

class Goalkeeper extends Soccer{
	void save() {
		System.out.println("어림없는 볼");
	}
}

class Striker extends Soccer{
	void shoot() {
		System.out.println(nation+"의 "+position + "!!! 구석을 노린 정확한 볼");
	}
}
//클래스를 정의할 때는 관련있는 것들을 묶어서 정의
public class Twins {

	public static void main(String[] args) {
		Goalkeeper wj = new Goalkeeper();
		//Goalkeeper 클래스의 참조변수인 wj는 Goalkeeper 클래스의 인스턴스 객체를 참조.
		wj.position = "골키퍼";
		wj.nation = "대한민국";

		Striker henry = new Striker();
		henry.position = "공격수";
		henry.nation = "프랑스";
		
		wj.save();
		henry.shoot();
		
		final int a = 3; 

	}

}
