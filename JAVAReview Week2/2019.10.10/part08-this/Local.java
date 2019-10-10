public class Local {

	// Field
	String name;
	int age;
	String sn;
	boolean isKorean;
	
	// Constructor
	Local(String name, int age) {
		this(name, age, null);
	}
	Local(String name, int age, String sn) {
		this.name = name;
		this.age = age;
		this.sn = sn;
		if (sn != null) {
			this.isKorean = sn.charAt(7) <= '4' ? true : false;
		}
	}
	
	// Method
	void output() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ֹε�Ϲ�ȣ : " + (sn == null ? "����" : sn));
		System.out.println(isKorean ? "�ѱ���" : "�ܱ���");
	}
	
}
