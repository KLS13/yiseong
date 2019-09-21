import java.util.*;
//Random을 이용해서 대문자A~Z중 하나의 문자를 만들어내고, 맞추는 게임
//A 유니코드 65
//힌트 : CHAR TO STRING 방법은  string str = String.ValueOf(char)
public class RanomQuiz {

	public static void main(String[] args) {
		
		Random random = new Random();
		char alpha = (char)(65+random.nextInt(26));
		String a = String.valueOf(alpha);
		Scanner input = new Scanner(System.in);
		
		System.out.print("Guess :" );
		if(input.nextLine().equals(a)) {
			System.out.println("Correct");
		}else
			System.out.println("Wrong");
		
	}
	
}
