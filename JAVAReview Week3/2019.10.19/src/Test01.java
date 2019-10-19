import java.util.Scanner;
/*
class Number {
	
	Number() {
		
	}
	
	void output(int num) {
		for(int i=0;i<100;i++) {
			try {
			int random = (int)(Math.random()*10);
			int stg = num/random;
			System.out.println(stg);
			}catch(Exception e) {
				System.out.println("0");
		}
	}
}
}


public class Test01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		Number number = new Number();
		
		System.out.print("정수를 입력하세요 >> ");
		int a = scanner.nextInt();
		number.output(a);
	}
}
*/

public class Test01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);	
		int number, div;
		
		for(int i = 0; i<100; i++) {
			System.out.print("10 이상의 양수 입력 >> ");
			number = scanner.nextInt();
			div = (int)(Math.random()*10);
			
			try {
				System.out.println(i+1+"번째 결과 : " + (number/div));
			}catch (ArithmeticException e) {
				System.out.println(i+1+"번째 결과 : " + "0");
			}
		}
		scanner.close();
	}
	
}
