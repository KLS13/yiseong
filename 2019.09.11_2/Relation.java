// Ŭ������ ����δ� �ν��Ͻ� ����� Ŭ���� ����� �ִ�.
// Ŭ���� �ȿ� �ִ� ��������� ��ȣ�ۿ��� �����ϴ�.
// ��, Ŭ���� ����� �ν��Ͻ� ����� �����ϴ� ���� �ȵ�.
class Seller{
	static String item; // �ν��Ͻ� ���
	static String job;
	
	static void cheer() {
		System.out.println("������ " + job + "������ ������ ! ");
	} // Ŭ���� ����� Ŭ���� ��� ����ϴ°� ����
	
	void introduce() { // �ν��Ͻ� ����� Ŭ���� ��� ����ϴ°� ����
		System.out.println("���� ������" + job + "�Դϴ�.");
	}
	void say() {
		System.out.println(item + " �缼��~~~");
	} // �ν��Ͻ� ����� �ν��Ͻ� ��� ����ϴ� ���� "����"
	static void lie() { // Ŭ���� ����μ��� �޼���
		System.out.print(item + " �̷��� �ȸ� ");
		System.out.println("���°� �����~");
	} // Ŭ���� ����� �ν��Ͻ� ��� ��� �Ұ�
} 
// �ν��Ͻ� ����� ��ü ���� �ÿ� �޸� ������ �Ҵ�޽��ϴ�.
// �ݸ�, Ŭ���� ����� ��ü ���� ������ �޸𸮿� �����մϴ�.
// ��ü �������� �ʾƵ� ����� �� �ִ� ����
public class Relation {

	public static void main(String[] args) {

		Seller sel = new Seller();

	}

}
