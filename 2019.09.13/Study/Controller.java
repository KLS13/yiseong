package Study;

// public : �ƹ������� ���� ����. ( ���� ������ ���� �д� )
// protected : ��� ���迡���� ������ �� �ִ�.
// private : Ŭ���� �������� ���ٰ���

class Coffee {
	
	public String nation;
	String name;
	
	Coffee(String nateion, String name){
		this.nation = nation;
		this.name = name; // �����ڴ� Ŭ���� ���ο� ��ġ���ִ�.
		// ���� private ����� ����� ���� ����
	}
}

public class Controller {

	public static void main(String[] args) {
	
		
		Coffee maxim = new Coffee("�ڽ�Ÿ��ī","���� ���ѿ���");
		maxim.nation = "�ڽ�Ÿ��ī"; //public Ŭ���� ���ΰ� �ƴϴ��� ���� ����

		maxim.name = "���� ���� ����"; 
		// Ŭ���� ���ΰ� �ƴ϶� ���ٺҰ�  private

	}

}
