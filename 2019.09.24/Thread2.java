class Task implements Runnable{
	public void run() {
		int n1 = 10;
		int n2 = 20;
		// �� �۾��� ó������ �������� �̸��� get �Ѵ�.
		String name = Thread.currentThread().getName();
		System.out.println(name + ":" + (n1+n2));
	}
}


public class Thread2 {

	public static void main(String[] args) {
		Task task = new Task();
		//Task ��ü�� ����!
		Thread t = new Thread(task);
		//���� ��������� �����忡 ó���� �۾��� ��������.
		//�����带 ����� �ƴϴ�.
		//--> �����尡 �����������, ó���� �۾��� �غ�� ���¿� �Ұ��ϴ�.
		
		t.start();
		//main �������� �۾�!
		System.out.println("End" + Thread.currentThread().getName());
		
		//��Ƽ ������ ���μ����� � �����尡 ���� ������ ��Ȯ�� ������ �� ����.
		//--> ������ ���μ����� ó����Ķ���.
	}
		
	}
