package ex;

import java.util.Scanner;

public class zxx {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("문자열을 입력하세요");
		String eng = input.nextLine();
		System.out.print("밀어낼 만큼의 숫자를 입력하세요.");
		int num = input.nextInt();
		String result = "";
		char change = 0;
		
		for(int i = 0; i<eng.length(); i++) {
			
			if( (eng.charAt(i) >='A' && eng.charAt(i) <= 'Z') || (eng.charAt(i) >= 'a' && eng.charAt(i) <= 'z')) {
				change = (char)(eng.charAt(i)+(num%26));
				if( (change > 'Z' && change < 'a') || change > 'z' ) {
					change = (char)(eng.charAt(i)+(num%26)-26);
				}
			}else{
				result += eng.charAt(i);
				continue;
			}
			result += change;
		}
		System.out.println(result);
	}
}