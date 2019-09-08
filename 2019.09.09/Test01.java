import java.util.*;

public class Test01 {
//for문을 활용한 횟수 반복하기
	public static void main(String[] args) {
		
		int i;
		int b;
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
	
		for(b=0 ;b<i; b++) {
			System.out.println("Hello World");
			
		}
	}
}


