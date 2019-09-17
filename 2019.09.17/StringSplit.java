import java.util.*;
//split : 가른다 !
public class StringSplit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String msg = "성과 이름을 공백으로 분리하여 입력 ";
		String firstName = " ";
		String lastName = " ";
		
		System.out.println(msg);
		String name = input.nextLine();
		//contains : 이 문자열 포함?  true or false
		//이 문자열을 기준으로 문자열을 잘라. 그런 다음 배열로 반환
		if(name.contains("")) {
			String[] strarr = name.split(" ");
			firstName = strarr[0];
			lastName = strarr[1];
			System.out.println("공백제거함");
			System.out.println(firstName + lastName);
		}else{
			System.out.println("공백이 없어요");
			System.out.println(name);
		}
	}
}
