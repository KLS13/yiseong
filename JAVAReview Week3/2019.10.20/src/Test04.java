class Man implements Cloneable {
	
	private String name;
	private int age;
	private int number;
	
	public Man(String name, int age, int number) {
		this.name = name;
		this.age =age;
		this.number = number;
	}
	@Override
	public String toString() {
		return "�̸� : " + name + ", ���� : " + age + "��" + " ��ȣ : " + number;
	}
	
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			e.getMessage();
		}
		return obj;
	}
	
}
public class Test04 {

	public static void main(String[] args) {

		Man man = new Man("alice", 20, 50);
		System.out.println(man);
		// man�� �����ϰ�  cloneman �� man�� ����.
		
		// Man cloneman = (Man) man.clone();
		Man cloneman = (Man)man;
		System.out.println(cloneman);
		
	}

}







