public class Test04 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		
		do {
			i++;
			
			if(i%2!=0) {
				continue; // 만약 짝수가 아닐경우 제외하고 
			}
			sum+=i; // i값을 sum에 저장
			
		}
		while(i<=100); // i가 100보다 같거나 작을때까지.
		System.out.println(sum); 
	}
}