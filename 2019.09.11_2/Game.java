class Fighter{
	String id;
	
	void setId(String str) {
		id = str;
		
	}
	void punch() {
		System.out.println(id + "�� �ָ԰���!");
	}
}

class Monster{
	String name;
	
	void SetName(String str) {
		name = str;
	}
	void getPunch() {
		System.out.println("�ָԿ� ����");
	}
}

public class Game {

	public static void main(String[] args) {
		Fighter me = new Fighter();
		Monster you = new Monster();
		
		me.setId("�赿��");
		you.SetName("�Ƽ��� ����");
		me.punch();
		you.getPunch();

	}

}
