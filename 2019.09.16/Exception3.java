public class Exception3 {

	public static void methodA() throws Exception{
		//���⼭�� ���ܰ� �߻��ϴ���,
		//ó���� ���� å���� �ڽ��� ȣ������ ������ �Ѱܹ�����.
		methodB();
	}
	public static void methodB() throws Exception{
		methodC();
	}
	public static void methodC() throws Exception{
		Exception e = new Exception();
		throw e;
	}
	public static void main(String[] args) {
		try {
			methodA();
		}catch(Exception e) {
			System.out.println("���ο��� ó��");
		}
	}

}
