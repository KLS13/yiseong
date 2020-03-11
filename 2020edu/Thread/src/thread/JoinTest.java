package thread;
//join()�޼��� : �ٸ� thread�� ����� ���� �����ؾ� �ϴ� ���� �ִ� ��� join() �޼��带 Ȱ��
//join() �޼��带 ȣ���� thread�� non-runnable ���°� �ȴ�.
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
		
		try { // join ���� ���� �� ~
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
