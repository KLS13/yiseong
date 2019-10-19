import java.util.Scanner;
/*
 Test03.java
나이를 입력 받아 출력하시오. 나이가 0~150 사이의 범위를 벗어나면 AgeException 클래스를 이용하여
예외를 처리하시오. 나이를 입력 받기 위해 getAge() 메소드를 이용하시오.
 */
class Person {
	int age;
	Scanner scanner = new Scanner(System.in);
	Person() {	}
	
	public void getAge() throws AgeException{
		
		System.out.print("나이를 입력하세요 >> ");
		this.age = scanner.nextInt();
		if(age>=0 && age<=150) {
			System.out.println(this.age);
		}else {
			throw new AgeException(1000, "나이는 0~150살 범위 내로 입력해주세요. ");
		}
	}
}	
	
class AgeException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private int errCode;
	
	public AgeException(int errCode, String message) {
		super(message);
		this.errCode = errCode;
	}
	public int getErrCode() {
		return errCode;
	}
}

public class Test02 {

	public static void main(String[] args) {
	
		Person person = new Person();
		try {
			person.getAge();
		} catch (AgeException e) {
			System.out.println("오류코드 " + e.getErrCode() + " :: " + e.getMessage());
		}
	}
}



