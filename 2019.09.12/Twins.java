//�ڹٿ� �����ϴ� ��� Ŭ�������� Object Ŭ������ ��ӹ���.
class Soccer{
	String position;
	String nation;

	void kick() {
		System.out.println("�߷� ��");
	}
}

class Goalkeeper extends Soccer{
	void save() {
		System.out.println("����� ��");
	}
}

class Striker extends Soccer{
	void shoot() {
		System.out.println(nation+"�� "+position + "!!! ������ �븰 ��Ȯ�� ��");
	}
}
//Ŭ������ ������ ���� �����ִ� �͵��� ��� ����
public class Twins {

	public static void main(String[] args) {
		Goalkeeper wj = new Goalkeeper();
		//Goalkeeper Ŭ������ ���������� wj�� Goalkeeper Ŭ������ �ν��Ͻ� ��ü�� ����.
		wj.position = "��Ű��";
		wj.nation = "���ѹα�";

		Striker henry = new Striker();
		henry.position = "���ݼ�";
		henry.nation = "������";
		
		wj.save();
		henry.shoot();
		
		final int a = 3; 

	}

}
