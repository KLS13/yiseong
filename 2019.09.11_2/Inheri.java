class Parents{
	String familyname;
}//Parents�� ��ӹ޾� child Ŭ������ ����ڴ�.

class Child extends Parents{
	//child���� parents�� ����� ��� ����.
	
}
// ����� ����ϴ� ������ �ڵ带 ���� �ϰ� �ڵ��� �ߺ��� ���̱� ���ؼ�.
// ���� ��ӵǴ� �׸� �����ڴ� ���Ե��� �ʴ´�.
// --> ������ �̸��� Ŭ���� �̸��̹Ƿ�
public class Inheri {

	public static void main(String[] args) {
		Child ch1 = new Child();
		ch1.familyname="aa";
		
		// �θ� Ŭ�����κ��� familyname ������ �����޾Ҵ�.
		// ���� �ش纯�� ��� ����.
	}

}
