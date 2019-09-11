class Fighter{
	String id;
	
	void setId(String str) {
		id = str;
		
	}
	void punch() {
		System.out.println(id + "의 주먹공격!");
	}
}

class Monster{
	String name;
	
	void SetName(String str) {
		name = str;
	}
	void getPunch() {
		System.out.println("주먹에 맞음");
	}
}

public class Game {

	public static void main(String[] args) {
		Fighter me = new Fighter();
		Monster you = new Monster();
		
		me.setId("김동현");
		you.SetName("아수라 백작");
		me.punch();
		you.getPunch();

	}

}
