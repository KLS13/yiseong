package Study;

class AAA{
	void method1() {
		System.out.println("���� 1��");
	}
	void method2() {
		System.out.println("���� 2��");
	}
}
class BBB extends AAA {
	void method3() {
		System.out.println("���� 3��");
	}
}

public class Poly2 {

	public static void main(String[] args) {
	
		AAA a1 = new BBB();
		//a1 : ���� �޼���1�� �޼���2�� ������ �־���� !
		//�׷��� BBB ��ü���� �� �� �ֳ�? �׷� ����������!
		//a1.method3(); // a1 : �����Ѵٰ� ���� ��ü�� ��� ����� ����Ѵٰ� ����  ������.

	}

}
