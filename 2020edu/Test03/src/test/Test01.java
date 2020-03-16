package test;

public class Test01 {

	public static void main(String[] args) {
		int i ;
		
		for(i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i * j + " ");
			}
			System.out.println("");
		}
	}

}
