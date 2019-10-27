//���� �� Ŭ������ ������ �����ڿ� �Ҹ��ڸ� ����
// ������ - ������ �� ȣ��
// �Ҹ��� - �Ҹ�� �� ȣ��(finalize)
// �̶�, �Ҹ�ÿ��� "�Ҹ�"�̶�� �޼����� ����Ѵ�.
// �׸��� ���� Ȯ���� ���� main �Լ��� ����
// ����--> ����Ȯ��--> ������ �÷��� ������� ���� --> �Ҹ�

class MyFriendInfo{
	protected String name;
	private int age;
	
	 MyFriendInfo(String name, int age){
		 this.name = name;
		 this.age = age;
	 }
	
	public void ShowMyFriendInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}
class MyFriendDatailInfo extends MyFriendInfo{
	private String addr;
	private String phone;

	public MyFriendDatailInfo(String name, int age, String addr, String phone) {
		
	
	}
	
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println(this.name + "�Ҹ�");
	}

	
	public void ShowFriendDetailInfo() {
		ShowMyFriendInfo();
		System.out.println("�ּ� : " + addr);
		System.out.println("���� : " + phone);
	}
}
public class Practice02 {
	

	public static void main(String[] args) {
		MyFriendDatailInfo f1 = new MyFriendDatailInfo("������", 30,"�뱸������", "010-3074-5687");
		MyFriendDatailInfo f2 = new MyFriendDatailInfo("�赿��", 31,"����������", "010-2074-5687");
		f1.ShowFriendDetailInfo();
		f2.ShowFriendDetailInfo();
		
		f1 = null;
		f2 = null;

		System.gc();
		System.runFinalization();
	}

}
