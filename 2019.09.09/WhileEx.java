import java.util.*;

public class WhileEx {
// Y 라는 답을 정해놓고 스펠링 맞추기
	public static void main(String[] args) {
		String inputStr = "";
	
		while(!inputStr.equals("Y")) {
			System.out.print("스펠링 하나를 입력하세요 : ");
			Scanner input = new Scanner(System.in);
			inputStr = input.nextLine();
			
			if(inputStr.equals("Y")) {
				System.out.println("답이 맞습니다");
				
			}else{
				System.out.println("답이 아닙니다");	
				
			}
		}
	}
}
