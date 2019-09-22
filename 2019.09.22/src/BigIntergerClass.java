import java.math.BigInteger;  // �Ϲ� �ڷ������� ǥ���� �� �ִ� �������� �� ū ���� ǥ���ϰ� ������ ���.
//���� : �ڹٿ��� ǥ���� �� �� �ִ� �Ѱ谪�� ���� (long���� �ִ밪) --> BigInterger �� �غ��� �� ����.
//�Ǽ� : �ڹٿ��� �Ǽ��� �ʿ������� ������ �߻��Ҽ� �ۿ� ����.(��Ʈ ����� ǥ���Ŀ� ����) --> BigDecimal �� �غ�����

// �Һ�(immutable) Ŭ�����̴�.
public class BigIntergerClass {

	public static void main(String[] args) {
		
		System.out.println("Long's MAX : " + Long.MAX_VALUE);
		System.out.println("Long's MIN : " + Long.MIN_VALUE);
		
		BigInteger big1 = new BigInteger("92233720368547758070");
		BigInteger big2 = new BigInteger("10000000000000000000");
		//���ڿ� ���·� ������ ���� !
		//������ ���� ������ �ڹٰ� �˾Ƽ� int�� long���� �Ǵ��ع�����.
		//�׷��� BigInteger�� �˾Ƽ� ������ ��ȯ�ϰ� ���Ѵ�.
		
		BigInteger big3 = big1.add(big2);
		System.out.println("������� : " + big3);
		
		BigInteger big4 = big1.multiply(big2);
		System.out.println("������� : " + big4);
		
		try {
		int num = big1.intValueExact();
		System.out.println("From BigInterger :" + num);
	}catch(Exception e) {
		System.out.println("����");
	}
//���ǻ��� : �Ϲ� �ڷ����� ���� �޸� ���� ������.  ����X
}

}