import java.util.*;
public class TestIf {

	public static void main(String[] args) {
		
		String id = "java";
		String pw = "gaegguljam";
		
		Scanner input = new Scanner(System.in);
		System.out.print("ID를 입력하세요 : ");
		String inputid = input.nextLine();
		
		
		// id와 inputid가 둘다 String 일때는 equals를 이용
		if(id.equals(inputid)) {
			System.out.println("아이디는 같습니다.");
			System.out.print("비밀번호를 입력하세요 : ");
			String inputpw = input.nextLine();
			
			if(pw.equals(inputpw)) {
				System.out.println("접속완료");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
		System.out.println("아이디가 틀렸습니다.");
	}
	
	}
}
