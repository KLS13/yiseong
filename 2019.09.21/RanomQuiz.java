import java.util.*;
//Random�� �̿��ؼ� �빮��A~Z�� �ϳ��� ���ڸ� ������, ���ߴ� ����
//A �����ڵ� 65
//��Ʈ : CHAR TO STRING �����  string str = String.ValueOf(char)
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
