public class Exception1 {

	public static void main(String[] args) {
		try {
			int[] a = {2,0};
			int b = 4/0;
			int c = b/a[0];
			System.out.println(c);
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 ���� ���� �߻�");
		}finally {
		System.out.println("���� ó�� ������1");

		} // finally ���� ������ ������ ����.
		  // ��, try catch�� ������ ����.
		System.out.println("���� ó�� ������2");
	}
	
	// �ڹ��� ��� ���ܴ� ��ü��. �׸��� ���� ��ü���� �������δ� Exception�� �ִ�.
	// ���� � ���ܰ� ������, catch�������� Exception���� ������ �����ϴ� !
	// --> �������� ���Ǵ� ���⿡�� ������ �ȴ�.

}
