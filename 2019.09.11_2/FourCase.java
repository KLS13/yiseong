
//�޼��嵵 Ŭ������ ���
//static ���� ��ü�������� ��밡��
class Case{
	//1. �Է°��� ������� ��� �ִ� ���
	double addThree(double a, double b, double c) {
		return a+b+c;
		// �̷� ��� ������ ���� �� ������ ������.
	}
	// 2. �Է°��� �ִµ� ������� ���� ���
	static void urValue(String str) {
		System.out.println(str);
	}
	// 3. �Է°��� ���µ� ������� �ִ� ���
	int returnTen() {
		return 10;
	}
	// 4. �Է°��� ������� ���� ���
	void say() {
		System.out.println("�޼��带 !");
		System.out.println("�ϰ��� !");
		System.out.println("�ڹ��Ҹ� !");
		System.out.println("�����ȳ� !");
	}
}

public class FourCase {

	public static void main(String[] args) {
		
		

		Case.urValue("���� �� ����"); //static ���� ��ü�������� ��밡��
		
		//Ŭ���� ����δ� ������ �޼��尡 �����ϴµ�,
		//��׵� �ΰ� 'Ŭ������ �����' ��� ǥ���Ѵ�.
		//����� �����δ� �ν��Ͻ����, Ŭ���� ����� �ֽ��ϴ�.

	}

}
