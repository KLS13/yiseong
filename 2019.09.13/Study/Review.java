package Study;
//���
//�������̵� : ��ӹ��� �޼��带 ������
//�����ε� : ���� �̸��� �޼��带 �Ű����� ���·� �޸��Ͽ� ����
//��Ӱ� ������
//�ڽ� Ŭ������ ������ ù�ٿ����� �θ� Ŭ������ �����ڸ� ȣ��.

class Medicine {
	String name;
	String effect;
	//������ ����� ��Ģ : 1.��ȯ���̾��� 2.Ŭ������� ������ �̸�
	
	Medicine(String name, String effect) {
		this.name = name;
		this.effect = effect;
		//�ݵ�� �ؾ��ϴ� ���� �ƴϳ�, �����ڴ� �ַ� ������ �ʱ�ȭ�� ���.
	}
	String getEffect() {
		return "���� ���´� !";
				
	}
}

class Penzal extends Medicine{
	@Override
	String getEffect() {
		
		return "���뿡 �����ϴ� !";
	} // �������� �޼��带 �ٽ� �����ߴ� ! --> �������̵�

	//������ ��Ģ�� �������� �ʾƼ� ����
	Penzal(String name, String effect){
		super(name,effect);
	}
	// �����ڴ� ��ӹ��� �ʴ´�.
}
public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
