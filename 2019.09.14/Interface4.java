// �������̽��� �������� � ������ �����ϸ� ������?
interface AA{
	void helloA();
}

interface BB{
	void helloB();
}
//���� ������ �ϴ� Ŭ���� AB ����

class AB implements AA,BB{
	public void helloA() {
		System.out.println("A�Դϴ�. �ȳ��ϼ���");
	}
	public void helloB() {
		System.out.println("B�Դϴ�. �ȳ��ϼ���");
	}
}
public class Interface4 {

	public static void main(String[] args) {
		AB ab = new AB();
		
		AA aa = new AB(); // AA�������̽� ���������� �ڱ⸦ �����ϴ� ABŬ������ ��ü�� �����Ҽ� ����.
		// AB ��ü�� AA �������̽� ������� ����ϰڴ� !
		BB bb = new AB();
		
		aa.helloA();
		// aa.helloB();  ����
		bb.helloB();

	}

}
