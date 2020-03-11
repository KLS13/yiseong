package thread;

import java.io.IOException;

public class TerminalnateThread extends Thread {
	
	private boolean flag = false;
	int i;
	
	public TerminalnateThread(String name) {
		super(name);
	}
	
	public void run() {
		while(!flag) { // Thread.stop() 는 쓰지않음.
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		System.out.println(getName() + " end !");  //getName() 쓰레드 이름
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public static void main(String[] args) throws IOException {

		TerminalnateThread thA = new TerminalnateThread("a");
		TerminalnateThread thB = new TerminalnateThread("b");
		
		thA.start();
		thB.start();
		
		int in;
		
		while(true) {
			in = System.in.read();
			if(in =='a') {
				thA.setFlag(true); 
			}else if(in =='b') {
				thB.setFlag(true);
			}else if(in =='m') {
				thA.setFlag(true);
				thB.setFlag(true);
				break;
			}/*else {
				System.out.println("다시 !");
			}*/
		}
		System.out.println("main end");
	}

}
