import java.util.*;

class ElseIfInPut {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner 는 클래스의 일종.
		// input은 입력을 받는 데 쓰이는 변수.
		int age;
		System.out.print("나이를 입력하세요 : ");
		age = input.nextInt();
		//정수형으로 값을 입력받아서 age에 대입하겠다.
		
		System.out.println("당신이 입력한 나이는 " + age);
		
		if( age >= 20) {
			System.out.println("성인입니다.");
			System.out.println("요금은 1250원 입니다.");
		}else if ( age<20 && age>=14 ) {
			System.out.println("청소년입니다.");
			System.out.println("요금은 750원 입니다.");
		}
		System.out.println("어린이입니다.");
		System.out.println("요금은 500원 입니다.");

	}
}
