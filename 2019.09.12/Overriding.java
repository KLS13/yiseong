class Cat{
	void eat() {
		System.out.println("�ͱ��ͱ�");
	}//����ο� ���Ǻ� ����

	void sleep() {
		
	}
}
class Babycat extends Cat{  
@Override // annotation �����. (@) ������ �ּ�  ��������

	void sleep() {
		
		super.sleep(); // �θ�Ŭ������ sleep()�� �״�� ���.
		// ������ ����
	}

	//	void eat_baby() {   // �ڵ尡 ���ʿ��ϰ� �����. �޼��� �ϳ� �þ
	//	System.out.println("�ȳ�");
	void eat() {
		System.out.println("�ȳ�");
	}
} //�θ�κ��� �������� �޼��带 �ٽ� �����ϴ� ��.
// �����ε� : �޼��� �̸��� ������, �Ű����� ���°� �ٸ�
// �������̵� : ��ӹ��� �޼��带 �״�� �����ϳ�, ���Ǵ� �ٸ���
public class Overriding {

	public static void main(String[] args) {
		Cat tom = new Cat();
		tom.eat();
		
		Babycat tommy = new Babycat();
		tommy.eat();
	}

}


