//���μ��� : �������� ���α׷� ( ���������������� �׳� ���α׷� )
//�������� : ��ǻ�� ����� ���ϰ� ���ִ� �ý��� �� �ϳ�
//--> �ü�� (Operating System) 
//�ü���� �ϴ� �߿��� �� �� �ϳ�
//--> ���α׷��� �����Ű��, �װ��� �����ϴ� ��
//���α׷�(���ÿ��� ROM�� �����) Read Only Memory
//���μ���(RAM ���� �ö� ���� ) Random Access Memory
//--> ������ : ���μ��� ������ �۾��� ó���ϴ� �ּ� ����
//////////////////////////////////////////////////////////
class Task1 extends Thread{ // Thread Ŭ������ ��ӹ޾� �۾��� ����� ��.

	@Override
	public void run() {
	//���⿡ �����尡 ó���� �۾��� �־��ָ� �ȴ�.
	} //run �̶�� �޼��带 ����.
	//runnanle �������̽��� �����Ͽ� ������ �۾��� ����°�.
	
}
//Runnable �������̽��� �����Ͽ� ������ �۾��� ������
class Task2 implements Runnable{
	public void run() {
		//���⿡ �����尡 ó���� �۾��� �־��ָ� �ȴ�.
		} //run �̶�� �޼��带 ����.
		//runnanle �������̽��� �����Ͽ� ������ �۾��� ����°�.
}

//�۾��̶�� ������ run() �ϰŶ�� ���ذ� ����� �ȵ� !!!!!!!!!!!!!!!!
//�Ϲ�������, ���� ���(����)�� �ϱ����ؼ� Runnable�� ����.

public class Thread1{

	public static void main(String[] args) {
		Thread ct = Thread.currentThread();
		//Thread.currentThread() : �� �۾��� ó���ǰ� �ִ� ������ ����
		String name = ct.getName(); // ������� ��ȯ!
		System.out.println(name); //main
		//--> main�� �ϳ��� �����忴��!
	}
}
