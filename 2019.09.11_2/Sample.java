//Ŭ���� : ��ü�� ����� ���� ���赵 ( �Ӽ��� ������� ���� )
//�ν��Ͻ� : ���赵�� ���� ���������� ������� ����
// EX) ��ȭ����� Ʋ: Ŭ����    ��ȭ: ��ü  
//  -->��ȭ�� ��ȭ ����� Ʋ�� �ν��Ͻ��̴�.
// EX) �ؾƲ(Ŭ����), �ؾ(��ü), �ؾ�� �ؾƲ�� �ν����̴�.
class Person {
	/* �Ӽ�(����)  : �̸�, ����  */
	String name;
	int age;
	//�ν��Ͻ� ������! --> ��ü���� ���������� ������ ������ �Ӽ�
    /*���(�޼���) :   */
	//�޼����? Ŭ���� ����Լ� ( �ַ� Ŭ������ ����� ��� )
	// ����   �Է°� -> ó�� -> ��°�
	static int numofHeart; // ��� ��ü�� ��������. static�� ���� Ŭ���� ����
	                       // --> ��ü�� �������� �ʾƵ� ������ �� �ִ�.
	
	void say() {
		System.out.println("���� ���� �Ѵ�.");
	}
	void singing() {
		System.out.println("������ ����ؼ�~~");
	}
	void pushUp(int num) {
		for(int i=0; i<num; i++) {
			System.out.println("�ȱ������" + (i+1) + "�� °!");
		}
	}
}
public class Sample {

	public static void main(String[] args) {
		Person.numofHeart = 1; // ��ü ���� ���� ������ ����.
		
		
		
		Person boy = new Person();
		//Person Ŭ������ boy��� ��ü�� �������!
		// => boy�� Person Ŭ������ �ν��Ͻ�
		int num=3; //(num�� ��Ʈ���� ����), �⺻ �ڷ������� ���� ����.
		Person girl = new Person(); 
		/* girl�� Person���� ����������.  ���� : �����͸� �����ϴ� ����
		                                                       �������� : �����͸� �����ϴ� ������ �ּҸ� �����ϴ� ����  */
		
		boy.name = "������";
		boy.age = 25;
		girl.name = "���̸�";
		girl.age = 20;
		//  . �� ��´ٴ°��� ���������� �����ϰ� �ִ� �ּҿ� �����ϰڴٴ� ��.
		// ������ ��ü�� ���� Ŭ������ �������ٰ��ص� --> �������̴�.
		System.out.println("���̴�" + boy.age + ", �̸��� " + boy.name);
		System.out.println("���̴�" + girl.age + ", �̸��� " + girl.name);
		System.out.println("������ ������ " + girl.numofHeart + ", ���̴�" + girl.age + ", �̸��� " + girl.name);
		System.out.println("������ ������ " + boy.numofHeart + ", ���̴�" + boy.age + ", �̸��� " + boy.name);
		boy.numofHeart=300; // Ŭ���� ������ ���� ������ �����ϹǷ�, ��� �����ؼ� �ٲٵ� ��ο��� ����(�޸� ���� ����)
		System.out.println("������ ������ " + girl.numofHeart);
		System.out.println("������ ������ " + boy.numofHeart);
	
		//////////////////////////////////////////////////////////////////
		
		Person per1 = new Person();
		Person per2 = new Person();
		
		per1.name = "������";
		per1.age = 40;
		
		per2.name = "���ؿ�";
		per2.age = 40;
		
		per1.say();
		per2.singing();
		per1.pushUp(5);
		
	}

}
