import java.util.Random; //�������� ���� ������ �������� �˰����� ������ ����.

public class RandomClass {

	public static void main(String[] args) {
	
		System.out.println(System.currentTimeMillis());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		Random ranNum = new Random(3);
		for(int i =0 ; i<5 ; i++) {
		System.out.println(ranNum.nextInt(10)); //10 �̸��� �������� ������ !
		}
		//���ڰ� 3�� ������� �ؼ� �����˰����� ���� ���� �̾Ƴ�.
		// �׸��� �̾Ƴ� ���� int�� ���̴�.
		//���ڰ��� �˰��� ���� ���� �̾Ƴ��Ƿ� ������ ������ ���Ѵ�.
		//���� ������ �ǹ̿����� �����̶�� �ϱ⿡�� ���� �ƽ��� 
		
		//�ݸ�, ���ڰ��� ���������� ������ ������ �������� �̾Ƴ�������
		//���ڰ��� ���������������� �˾Ƽ� ���ڰ��� �ִ´�
		//--> �̶��� ���ڰ��� '���� �ð�(ms)' �� ���� �����Դϴ�.
		
		
		
	}

}
