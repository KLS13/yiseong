import java.util.Scanner;

public class Test01_1 {
//입력받은 숫자만큼만 반복하기 !
	public static void main(String[] args) {
		
		
		int i;
		int b;
		
		System.out.print("숫자를 입력하세요 : ");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
	
		for(b=i ; b>=1; b--) {
			System.out.println("반복 !");
		}
		System.out.println("총" + i + "회 반복하였습니다.");
	
	}
}
