//�������̽� : ��ȣ�ۿ��� �ϱ� ���� ������ �Ծ�

//�����
//--> ����,�õ�,ä��ĭ,����ĭ, �ܺ� ��ư�� ��� ( �ݵ���־�� �ϴ� ��ɵ� ����)
// �̷� �͵��� �������̽��� ����

interface Refri{
 // ���,�޼��� �� �� �ֽ��ϴ�.
	int temper = -5; // public static final int
	void openDoor(); // public abstract void
	// �����ڴ� �����־ �˾Ƽ� �ٴ´�.
}
// ���� �������̽��� ������� ���� Ŭ������ temper�� ������ -5 �̰�
// opendoor �޼��带 �ݵ�� �����ؾ���.
// ��, �� ���� ������ �������̴�.

//�������̽��� ����̶�� ǥ�� �Ⱦ���, ����(implements)�̶�� ǥ�� ���ϴ� !
class LGRefri implements Refri{
	
	// �������̽��κ��� �ο��Ǵ� ������ :
	// ���������� public, �߻�޼��� ������ ���� ������
	public void openDoor() {
		System.out.println("����� ���� �����׿�~");
	}
}

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
