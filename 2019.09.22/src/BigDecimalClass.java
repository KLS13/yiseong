import java.math.BigDecimal;
//���� : �ڹٿ��� ǥ���� �� �� �ִ� �Ѱ谪�� ���� (long���� �ִ밪) --> BigInterger �� �غ��� �� ����.
//�Ǽ� : �ڹٿ��� �Ǽ��� �ʿ������� ������ �߻��Ҽ� �ۿ� ����.(��Ʈ ����� ǥ���Ŀ� ����) --> BigDecimal �� �غ�����


public class BigDecimalClass {

	public static void main(String[] args) {
		double a = 24.3953;
		double b = 50.343998;
//double : 8����Ʈ �Ǽ� �ڷ��� ( ���� 4����Ʈ�� �Ҽ��� ���ڸ� , �ڿ� 4����Ʈ�� �Ҽ��� �Ʒ�
		//��Ʈ ����� �Ǽ� ǥ���� �ʿ��� ���� �߻�
		System.out.println(a+b);
		//�Ϲ� �Ǽ� �ڷ������������ : 74.73929799999999 (����)
		
		//���ڿ��� �����͸� �����Ѵ�!
		/*
		 * ���ڿ��� �ƴ϶� �׳� �Ϲ� �Ǽ�(float)�� ������ ��� :
		 * �̹� ���� ���� �ڹٰ� �װ��� �Ϲ� �Ǽ��� �����Ͽ� ������ �����ϴ� ���·� BigDecimal�� ������.
		 */
		BigDecimal num = new BigDecimal(String.valueOf(a));
		BigDecimal num2 = new BigDecimal(String.valueOf(b));

		System.out.println(num.add(num2));
		// BigDecimal�� �Һ�(immutable) Ŭ�����̴�.
	}

}
