//�ڹٴ� ���߻�� �����������
// �θ�� ��Ŭ������ ����
// �׷��� ��Ӱ� ������ ���ÿ� ����

class Animal{
	String species;
	
	void setSpecies(String species) {
		this.species = species;
	}
	void info() {
		System.out.println("����" + this.species + " �Դϴ�");
	}
}
//����, ���, �����, �ͱݷ�, ��Ÿ ���

interface Bird{
	int numOfwings = 2;  // public static final int 
	void fly(); //public abstract void
}
interface Beast{
	int numOfwings = 4 ;
	void hunt();
}
////////////////////////////////////////////////////////////////
interface elec{
	
}
class PC implements elec{
	
}
////////////////////////////////////////////////////////////////

class Eagle extends Animal implements Bird{
	//Eagle �� Animal �� ��ӹ����鼭 ���ÿ� Bird�� ����
	public void fly() {
		System.out.println("�������� ���� !");
	} // �������̽��� �޼��带 ������ ���� ���������ڵ� ���� !
	
	void moreInfo() {
		System.out.println("������ " + numOfwings + "�� �Դϴ�");
	}
}

class Tiger extends Animal implements Beast{
	//Eagle �� Animal �� ��ӹ����鼭 ���ÿ� Bird�� ����
	public void hunt() {
		System.out.println("ȣ���̰� ���� !");
	} // �������̽��� �޼��带 ������ ���� ���������ڵ� ���� !
	
	void moreInfo() {
		System.out.println("�ٸ��� " + numOfwings + "�� �Դϴ�");
	}
}
public class Interface2 {

	public static void main(String[] args) {
		///////////////////////////////////////////////////////////////
		PC pc = new PC();
		elec el = new PC();
		//�������� ���Ǵ� �������̽����� ������ �ȴ�.
		//���� ������ �ڱ� �ڽ��� Ŭ���� �� �Ǵ� ��� ���迡�� �ڽź��� �Ʒ��� �ִ� Ŭ���� �� ��ü�� ��� ������ �� �ֵ�.
		//--> �������̽��� ������ Ŭ������ �������̽��� �ڽ��̶�� �� �� �ֵ�.
		///////////////////////////////////////////////////////////////
		Eagle hanhwa = new Eagle();
		hanhwa.setSpecies("������");
		hanhwa.info();
		hanhwa.moreInfo();
		hanhwa.fly();
		
		Tiger ti = new Tiger();
		 ti.setSpecies("ȣ����");
		 ti.info();
		 ti.moreInfo();
		 ti.hunt
		 ();
	}

}
