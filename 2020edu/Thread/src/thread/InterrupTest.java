package thread;
//thread�� join, sleep, wait �޼��忡 ���� ��ŷ �Ǿ��ٸ� interrupt�� ���� �ٽ�
// runnable ���°� �ɼ� ����.
public class InterrupTest extends Thread{

	public void run() {
		int i;
		for(i=0; i<100; i++) {
			System.out.println(i);
		}
		
		try {
			sleep(5000);
		} catch (InterruptedException e) {
			System.out.println(e);
			System.out.println("����� !!!!");
		}
	}
	public static void main(String[] args) {
		
		InterrupTest it = new InterrupTest();
		it.start();
		it.interrupt();
		
		System.out.println("end");

	}

}
