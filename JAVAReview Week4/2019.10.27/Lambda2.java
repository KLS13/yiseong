interface Cellphone{
	void RingRing();
}
//��ǥ : Cellphone�� �����ϴ� Ŭ������ ���� ������ �ʰ� ��ü ���� �� ����� �� �ִ�.
public class Lambda2 {

	public static void main(String[] args) {
		Cellphone cp = ( ) -> {
		// �����Ϸ��� �Ű����� Ÿ�԰� ������ �˰� �ִ�!   �ƴϱ� �� ����
		// �����Ϸ��� �����ؾ��ϴ� �޼ҵ���� �˰� �ִ�.  �ƴϱ� �� ����
		// �����Ϸ��� �����ؾ��ϴ� �޼ҵ� ������ �˰��ִ�. �ƴϱ� �Ƚ���
		System.out.println("���� ����~");
	};

	cp.RingRing();
	}
}
