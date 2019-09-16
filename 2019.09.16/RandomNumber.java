import java.util.InputMismatchException;
import java.util.Scanner;
public class RandomNumber {

	//랜덤으로 번호를 만들어낸다.
	
	public static void main(String[] args) {
	
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		

		
		do {
			count++;
			
			System.out.println("input number in 1~100");
			try {
				//예외가 발생할 경우 처리할 예정
				input = new Scanner(System.in).nextInt();
			}catch(InputMismatchException e) {
				System.out.println("다시  입력"); 
				continue; 	
			}
				
			
			if(answer > input) {
				System.out.println("업");
			}else if(answer < input) {
				System.out.println("다운");
			}else {
				System.out.println("Correct");
				System.out.println("u tried " + count);
				break;
			}
		
		
	
		}
		
		while(true);
		
		
		
		//1~100 사이의 랜덤숫자 맞추기
		//1. 랜덤으로 숫자를 만들어 저장해둠.
		//2. 사용자 입력을 받기(사용자가 예측한 정수값)
		 //--> 정수가 아닌 이상한 걸 입력하면 예외
		//3. 비교하기 -> 맞으면 맞다, 틀리면 틀리다
		//4. 맞을 경우에는 맞다고하고 종료.  그러나 틀리면 다시!
		
	}

}

