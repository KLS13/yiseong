import java.util.*;
//정해진 아이디와 패스워드가 있는 상태에서  사용자입력
//아디를 먼저받고 아디가 일치할 경우 비밀먼호를 받음
//모두 맞추었을 시 프로그램은 "로그인 성공"
//맞추지 못하면 " 로그린 실패" 다시 입력하게하며 총 기회는 5번
//5번 실패시 종료



public class StringEqualQuiz {

	public static void main(String[] args) {
		String id = "java";
		String pw = "pw1234";
		int chance = 5;
		Scanner input = new Scanner(System.in);
		
		while(chance !=0) {
			System.out.println("id입력");
			String inputId = input.nextLine();
			if(id.equals(inputId)) {
				System.out.println("pw입력");
				String inputPw = input.nextLine();
				
				if(pw.equals(inputPw)) {
					System.out.println("로그인 성공");
					break;
				}else {
					System.out.println("로그인 실패!");
				}
			}else {
				System.out.println("로그인실패");
			}
			System.out.println("남은기회 : " + --chance);
	 	}
	}
}


