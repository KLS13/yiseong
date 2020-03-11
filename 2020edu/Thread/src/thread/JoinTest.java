package thread;
//join()메서드 : 다른 thread의 결과를 보고 진행해야 하는 일이 있는 경우 join() 메서드를 활용
//join() 메서드를 호출한 thread가 non-runnable 상태가 된다.
public class JoinTest extends Thread{
	
	int start,end,total;

	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		int i ;
		for(i=start; i<=end; i++) {
			total += i;
		}
	}
	public static void main(String[] args) {

		
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		try { // join 먼저 수행 후 ~
		jt1.join();
		jt2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		int total = jt1.total + jt2.total;
		System.out.println("jt1.total : " + jt1.total);
		System.out.println("jt2.total : " + jt2.total);
		
		System.out.println(total);
		
	}

}
