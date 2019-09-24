class Task implements Runnable{
	public void run() {
		int n1 = 10;
		int n2 = 20;
		// 이 작업을 처리중인 스레드의 이름을 get 한다.
		String name = Thread.currentThread().getName();
		System.out.println(name + ":" + (n1+n2));
	}
}


public class Thread2 {

	public static void main(String[] args) {
		Task task = new Task();
		//Task 객체를 생성!
		Thread t = new Thread(task);
		//새로 만들어지는 스레드에 처리할 작업을 전달해줌.
		//스레드를 만든게 아니다.
		//--> 스레드가 만들어졌을때, 처리할 작업이 준비된 상태에 불과하다.
		
		t.start();
		//main 스레드의 작업!
		System.out.println("End" + Thread.currentThread().getName());
		
		//멀티 스레드 프로세스는 어떤 스레드가 먼저 끝날지 정확히 예측할 수 없다.
		//--> 이유는 프로세스의 처리방식때문.
	}
		
	}
