// ��ü : ����̳� �繰 ���� ����Ʈ���������� ������ ��.
// ��ü ���� ��� : ��ü���� ��ȣ�ۿ��ϸ鼭 ���α׷��� �����ϴ� ��.
// Ŭ���� : ��ü�� ����� ���� ���赵
// �ν��Ͻ� ��� : ��ü���� ���������� ������ ������ ���
// �Ϲ����� ������� ����.
// Ŭ���� ��� : ��ü���� �����ϴ� ���
// static �̶�� Ű���� ���

class Cat{
	/* ��� ���� (�Ӽ�) */
	/* �޼���(����� ���� �Լ�, ��ɴ��) */
	String name;
	int age;
    //Ŭ���� ����
	static int numofTail; // static ������� ���� ȿ�� - ��ü �������� �ʾƵ� ���� ����
	
	void nothing() {
		System.out.println("�אl������");
	}
	void angry() {
		System.out.println("�Ͼƾư�!");
	} 
	//�̸��� ���̸� �ʱ�ȭ�ϴ� �޼��嵵 ���� �� �ִ�.
	void init(String str, int num) {
		name = str;
		age = num;
		// Ŭ���� ���ο����� �޼��尡 ��� ������ ������ �� �ִ�.
	}
	void introduce() {
		System.out.println("���� " + name + "�Դϴ�." + "���̴�" + age);
	}
}
// ���赵�� �ִٰ� �ؼ�, ��ü�� �ִ� ���� �ƴϴ�.
// ��ü�� �������־�� ��μ� ��¥ ��ü�ν� ������ �� �ֵ�.

public class Review {


	public static void main(String[] args) {
		Cat.numofTail = 1;
		
		Cat tom = new Cat();
		Cat dor = new Cat();
		// tom �̶�� ���� ������ Cat Ŭ������ �ν��Ͻ��� �ǹ��Ѵ�.
		// �������� : �޸� �ּҸ� �����ϴ� ����
		
		tom.init("��",5); // �̸��� ��, age�� 5
		tom.introduce();

		System.out.println(dor.numofTail);
		System.out.println(tom.numofTail);
		/*tom.age = 3;
		tom.name = "��";
		tom.angry();
		tom.nothing();
		System.out.println(tom.age + "��" + ", �̸� : " + tom.name); */
		
	}

}
