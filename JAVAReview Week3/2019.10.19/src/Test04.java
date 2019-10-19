import java.util.Scanner;

/*
 주민등록번호(하이픈 포함)를 입력 받아 출력하시오. 주민등록번호가 14글자가 아니면 
PerIDException 클래스를 이용하여 예외를 처리하시오. 주민등록번호를 입력 받기 위해
getPerID() 메소드를 이용하시오.

 */

public class Test04 {
	// Field
		static Scanner scanner = new Scanner(System.in);
		
		// Method
		public static String getID() throws AgeException2 {
			System.out.print("주민등록번호 입력 >> ");
			String jumin = scanner.nextLine();
			if (jumin.length() < 14 || jumin.length() > 14) {
				throw new AgeException2("14자리를 입력해주세요");
			}
			return jumin;
		}
	public static void main(String[] args) {
		
		try {
			String jumin =  getID();
			System.out.println("당신의 주민번호는 " + jumin + "이다.");
		} catch (AgeException2 e) {
			System.out.println(e.getMessage());
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

}