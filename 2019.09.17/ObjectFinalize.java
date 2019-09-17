class Person{
	
	String name;
	
	public Person(String name) {
		this.name = name;
	} // ��ü�� �Ҹ�� �� ȣ��Ǵ� finalize() 
	

	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("destroyed : " + name);
	}
}
//�ڹٴ� ������ �÷����� ������.
// --> �޸𸮸� �������� (���ʿ��� �͵��� ġ����)

//Memory Managed Language : �޸� ������ ���� ���ص� �Ǵ� ���
//  --> �ڹ�, ���̽�, �ڹٽ�ũ��Ʈ  ��
//Memory unManaged Language : �޸� ������ ���� �ؾߵǴ� ���
//  --> C���, C++
public class ObjectFinalize {

	public static void main(String[] args) {
		Person p1 = new Person("Kang");
		Person p2 = new Person("Park");
		//null : �����Ͱ� �������� �ʴ´ٴ� �ǹ�
		p1 = null; // ������ �÷����� ����� �� �� �ִ�.
		p2 = null; // ������ �÷����� ����� �� �� �ִ�.
		//���� ���� �Ǹ�, �޸𸮸� �����ϴ� ���ʿ��� ������ ��
		
		System.gc(); // �ʿ���� �ֵ��� ��Ƴ���
		System.runFinalization(); //��Ƴ��� �ֵ��� finalize�� run���Ѷ�
		
		System.out.println("end of program");
		

	}

}
