//����� �ϴ¾� :  �θ�,����,���� Ŭ����  ||  ����� �޴¾� : �ڽ�, ����, ���� Ŭ����
// "�ڹ�" ������  '���� ���' ���� ���. -->  �ϳ��� �ڽ�Ŭ������ �ϳ��� �θ� Ŭ�������� ��ӹ���
// �ٸ� ��ü ���� ������ ���� ��� ����
// �ϳ��� �θ�Ŭ������ ���� �ڽ� Ŭ������ ����� ���� ����
class Person{
	String name;
	
	Person(String name){
		System.out.println("����� ������!");
		this.name = name;
	}
	Person(){
		System.out.println("������ ����� ������!");
		this.name = "����";
	}
	void sleep() {
		System.out.println(this.name + "�� �帣��~ ~ ~");
	}
	
}
	class Student extends Person{
		Student(String name){
			this.name = name;
		}
	}

public class Review {

	public static void main(String[] args) {

/*		Person per1 = new Person("�����");
		Person per2 = new Person();
		per1.sleep();
		per2.sleep();
		//per1.name = "������";   */
		
		Student stu1 = new Student("�����");  // �����ڴ� ��ӵ����ʱ� ������ class Student ���� �ٽ��ѹ� �ۼ�.
		stu1.sleep();   
	}

}
