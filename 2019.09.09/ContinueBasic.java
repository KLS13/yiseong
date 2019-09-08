public class ContinueBasic {

	public static void main(String[] args) {

		int i = 0;
		while(i<11) {
			i++;
			if(i%2==0) {
				continue; // 짝수를 제외하고 계속~
			}
			System.out.println("i는" + i);
		}
	}

}
