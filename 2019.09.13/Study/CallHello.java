package Study;
import packageTest.Hello; // import ��Ű����.Ŭ������

public class CallHello {

	//�ٸ� ��Ű���� �ִ� Ŭ������ ���
	public static void main(String[] args) {
		
		packageTest.Hello.sayHello();
		packageTest.Hello.sayBye();
		
		//��Ű����.Ŭ������.�޼����();
		
		//���� ���� �ϸ� ������. --> �Ǽ�����
		//�ذ�å : package�� ����ϰڴٴ� ������ ����.  import packageTest.Hello;
		
		Hello.sayHello();
		Hello.sayBye();
		
		// package ���� Ŭ������ �����صξ��� ���� ����
		// ��Ʈ���� �ڵ带 ���Ⱑ ����. ���� ������ ������ ����
		// ��Ű�� ������ ���ϸ� �־��

		
		
	}

}
