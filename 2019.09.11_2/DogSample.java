

class Dog{
	// �Ӽ� : �̸�, ����, ����
	String name;
	String breed;
	int age;
	
	void bark() {
		System.out.println("�۸�");
	}
	void eat(String food) {
		System.out.printf("%s �Ա�! %n", food);
	}
	void hello(String person) {
		if(person.equals("����")) {
			System.out.println("�ݰ����� ���δ� ");
		}else if(person.equals("����")) {
			System.out.println("������ ������");
		}else {
			System.out.println("---------");
		}
	}

	// ��� : ¢��, �Ա�, ��� �����ϱ�
	}

public class DogSample {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		
		dog1.name = "�����";
		dog1.breed = "Ǫ��";
		dog1.age = 30;
		
		System.out.println("�̸��� " + dog1.name + ", ������ " +
		                   dog1.breed +", ���̴� " + dog1.age);
		dog1.bark();
		dog1.eat("���");
		dog1.eat("����");
		dog1.hello("����");
		dog1.hello("����");
		dog1.hello("����");
		

	}

}
