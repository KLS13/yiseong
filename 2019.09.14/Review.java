// static : ��ü���������ʾƵ� ���ٰ���, ��� ��ü�� ����
// final : ���ȭ ! < �����Ҽ�����.
          //������ ���ȭ : ������ X
          //�޼��� ���ȭ : �������̵� �Ұ�
          //Ŭ���� ���ȭ : ��� �Ұ�

// ������ : ���� ������ �ڽ��� Ŭ������ �Ǵ� �ڽź��� ��� ���� �Ʒ��� �ִ� Ŭ�������� ��ü ����
class Water{
	protected String color;
	//Ŭ���� �������� ������ ����Ѵ�.
	
	String setColor(String color) {
		this.color = color;
		return this.color;
	}
	
}

class BoriWater extends Water{
	//�ڽ�Ŭ������ �θ�Ŭ���� is-a ��������
	//ex) �������� ���̴� 
	public String setColor(String color) {
		this.color = color + "����";
		return this.color;
		
	}
}

public class Review {

	public static void main(String[] args) {
		Water water = new Water();
		System.out.println(water.setColor("����"));
		BoriWater bwater = new BoriWater();
		System.out.println(bwater.setColor("����"));
		
		Water wt1 = new Water();
		Water wt2 = new BoriWater();
		// <������>
	}

}
