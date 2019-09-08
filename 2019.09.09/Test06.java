import java.util.*;
public class Test06 {
//입력한 수 범위 내의 구구단 출력하기.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,b;
		int a;
		
		System.out.print("숫자를 입력하세요 : ");
		i = input.nextInt();
		System.out.print("숫자를 입력하세요 : ");
		b = input.nextInt();
		
		
		for( a=i; a<=b ; a++) {
			for( int k = 1 ; k<=9 ; k++) {
				System.out.print(a*k + " ");
			}
			System.out.println(" ");
		}

	}

}
