package Study;

class Animal{
	// toString�� ObjectŬ������ �����ϴ� �޼���.
	public String toString() {
		return "����";
	} // ���ڿ� ���·� ����ϰԲ� ��ȯ����!
}

class Pig extends Animal {
	// toString�� ObjectŬ������ �����ϴ� �޼���.
	public String toString() {
		return "����";
	} // ���ڿ� ���·� ����ϰԲ� ��ȯ����!
	
}

class Tiger extends Animal {
	// toString�� ObjectŬ������ �����ϴ� �޼���.
	public String toString() {
		return "ȣ����";
	} // ���ڿ� ���·� ����ϰԲ� ��ȯ����!
	
}

class Rabbit extends Animal {
	public String toString() {
		return "�䳢";
}

}
class ZooKeeper{
	//������ 100�� �̶�� ??
	// --??  feed�� 100�� �����ε�??
	// NO. "������ �̿�"
	void feed(Tiger tiger) { // Tiger Ŭ������ ��ü�� �Է°����� �ްڴ�.
		System.out.println(tiger + "���� ���� �ֱ�!");
	}
	void feed(Pig pig) { // Tiger Ŭ������ ��ü�� �Է°����� �ްڴ�.
		System.out.println(pig + "���� ���� �ֱ�!");
	}
	void feed(Animal ani) {
		System.out.println(ani + "���� ���� �ֱ�!");
	} // ������ �̸��� �޼��尡 ������ ���������� �ƴ϶� ������ ��ü�� �޼��带 ���
	  //������ ��ü�� �޼��带 ���
}


public class Zoo {

	public static void main(String[] args) {
		Animal ani = new Animal();
		System.out.println(ani);
		Pig pig1 = new Pig();
		Tiger tiger1 = new Tiger();
		Rabbit rab1 = new Rabbit();
		ZooKeeper zoo1 = new ZooKeeper();
		
		zoo1.feed(tiger1);   // 
		zoo1.feed(pig1);  
		// 
		zoo1.feed(rab1);   // 
	
		
		/*System.out.println(pig1);
		zoo1.feed();
		System.out.println(tiger1);
		zoo1.feed();
		// �̷����̸� �ڵ� ������.  feed���ٰ� ��ü�� ����! */
	}

}
