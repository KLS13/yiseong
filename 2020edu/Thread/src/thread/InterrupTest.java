package thread;
//thread가 join, sleep, wait 메서드에 의해 블럭킹 되었다면 interrupt에 의해 다시
// runnable 상태가 될수 있음.
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
			System.out.println("깨어났다 !!!!");
		}
	}
	public static void main(String[] args) {
		
		InterrupTest it = new InterrupTest();
		it.start();
		it.interrupt();
		
		System.out.println("end");

	}

}
