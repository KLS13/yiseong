//currentTimeMillis();  <= �ɸ� �ð�
public class CurrentTime {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		
		int a = 0 ;
		for(int i=0; i<1000000000; i++) {
			a+=i;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}

}
