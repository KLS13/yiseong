//�����ڴ� ��ü�� ������ �� �ݵ�� �� �� ȣ��Ǵ¸޼���!
// Ŭ���� ������ �����ִ� ����� �ִ��� ����־ ����� ����
// �����ڴ� ������ �޼���. ���� �����ε��� ����
class Singer{
	String name;
	String song;
	
	Singer(String name, String song){
		this.name=name;
		this.song=song;
	}
	Singer(String name){
		this.name=name;
		this.song= "����";
	}
	Singer(){
		this.name= "����";
		this.song= "����";
	}
	void introduce() {
		System.out.println("���� ���� " + this.name + " �Դϴ�. ��ǥ���� " + this.song + " �Դϴ�.");
	}
}
public class ConstructorEX {


	public static void main(String[] args) {
		
		Singer singer1 = new Singer("����ű�", "���");
		Singer singer2 = new Singer("HOT", "��");
		Singer singer3 = new Singer("��ȿ��", "���� ���");
		Singer singer4 = new Singer("���ƾ�");
		Singer singer5 = new Singer();
		
		singer1.introduce();
		singer2.introduce();
		singer3.introduce();
		singer4.introduce();
		singer5.introduce();
		

	}
	// 1.��Ÿ   2. �߰�ȣ ¦ �ȸ´°�  3. ���� ������ �� �Ǽ��� ��
	
	//�����ڴ� ��ü�� ������ �� �ݵ�� �� �� ȣ��Ǵ� �޼����Դϴ�.
	//�ַ�, ��ü�� ��� ���� �ʱ�ȭ�� ���˴ϴ�.
	//�޼��� �̹Ƿ� �����ε��� �����մϴ�.
	//��ȯŸ���� �����ʰ�, Ŭ������� ������ �̸��� ���ϴ�.
	//this��� Ű����� �����Ǵ� ��ü '�� �ڽ�'�� �ǹ�.

}
