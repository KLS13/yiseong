//Overloading.java�� �����Ű��
//JVM�� main �޼��带 ���۽�Ŵ
public class Overloading {
	
	static int add(int x, int y) {
		return x+y;
	}
	static int add(int x, int y, int z) {
		return x+y+z;
	}
	
	static int add3(int x, int y, int z, int k) {
		return x+y+z+k;
	}

	public static void main(String[] args) {
		System.out.println(add(2,2));
		//Ŭ���̾�Ʈ : 2���޾Ƽ� ���ϴ� �޼��帻��, 3���޾Ƽ�  ���ϴ¤� �ļ��嵵 �������
		System.out.println(add(2,2,2));
		//Ŭ���̾�Ʈ : 3������ 4�� 
		System.out.println(add3(2,2,2,2));
		//================================�޼ҵ带 ��� �������ϰ� ���ŷο�.
		// �����ε� : ���� �̸��� �޼��带 �����, �Ű������� �ٸ���.
		//==================================================
		System.out.println(add(2,2,2));
		System.out.println(add(3,3));  
		//�ڹٿ����� �޼��带 ����ؾ� �� ��, �޼����� �Է°� ���¸� ���� �ʿ��� �޼��带 ã�ư�.
		//�޼������ ���Ƶ� �Է°��� �ٸ��� ����      "�޼��� �����ε�"
		
		System.out.println(5);
		System.out.println('A');
		System.out.println("���ڿ�");
		
		// println�� �ڹٿ��� ��ü������ �����ϴ� �޼���
		// �̶�, println ���� �����ε� �Ǿ�����.
	}

}
