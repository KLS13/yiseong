class Methods{
	// " y = x + 6 "
	int method1(int x) { // int �� �����͸� �ϳ� �Է���   ex) 2�� �Է½�   "int method1(int x, int y)"
 		int y = x + 6;
		return y;
		
	} //1. ��ȯ��(int) : ������� �ڷ���
	  //2. �޼����(method1) : �޼����� �̸�(����ڰ� ������ �޼����)
	  //3. (int x) �� �Է°� --> �޼��忡 ������ �� �Է°��� ���¸� ����.
     //4. return : ����� ��������(��ȯ)
      // �޼���� Ư���� �۾��� �����ϱ� ���� ���� ��� ����!
      // �޼���� �Է°��� �ٲ㰡�鼭 �ƹ����� ����� �� �ִ�.

	int method2(int x, int z) {
		int y = x + z;
		return y;
	}
}
public class MethodSample {
	//���α׷��� ���۵Ǵ� ��!
	public static void main(String[] args) {
		Methods method1 = new Methods();
		Methods method2 = new Methods();
		// Methods Ŭ������ ��ü�� ����� �װ��� method1 �̶�� ���� ������ ����Ű�� ��.
		

		System.out.println(method1.method1(8));
	
		//method1 �� ����Ű�� �ִ� ��ü �ȿ��� method1 �̶�� �̸��� �޼��尡 ������.
		//�׸��� �װ��� �����.
		//�̶�, 8 �̶�� ���� �����϶�� ���.
		System.out.println(method1.method1(7));
		System.out.println(method1.method1(3));
		
		System.out.println(method2.method2(8,8));  
		System.out.println(method2.method2(7,9));  
		
		// Tip1 . Ŭ�������� �빮�ڷ� �����ϴ°� ����
		// Tip2 . �޼������ �ҹ��ڷ� �����ϴ°� ����
		// Tip3 . �޼������ ���� ����, ����� ���۰��� �Ѵ�.
		//        ex) int add(int x, int z) {int y = x + z; return y;}  ��������ΰ��� ����.
	
	}

}

		//�޼��忡�� 4���� ���°� �����Ѵ�.
		// ?? : �Է°��� ������� ���������� �����ϱ� ����.
		/* 1.�Է°��� ������� �� �����ϴ� ���
		 * 2.�Է°��� �ִµ� ������� ���� ���
		 * 3.�Է°��� ���µ� ������� �ִ� ���
		 * 4.�Է°��� ������� ���� ��� */
