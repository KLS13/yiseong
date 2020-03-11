package thread;

class MyThread implements Runnable{

	@Override
	public void run() {
		int i;
		
		for ( i=0; i<=100; i++) {
			System.out.print(i + " ");
			
			try {
				Thread.sleep(10);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println("start");
		/*
		MyThread my1 = new MyThread();
		MyThread my2 = new MyThread();
		
		
		my1.start();
		my2.start();
		*/
		/*
		MyThread run1 = new MyThread();
		Thread th1 = new Thread(run1);
		th1.start();
		
		MyThread run2 = new MyThread();
		Thread th2 = new Thread(run2);
		th2.start();
		*/
		Thread t = Thread.currentThread();
		System.out.println(t);  // Thread[main,5,main]
		
	
		
		System.out.println("end");
	}

}
