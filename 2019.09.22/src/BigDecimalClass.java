import java.math.BigDecimal;
//정수 : 자바에서 표현을 할 수 있는 한계값이 존재 (long형의 최대값) --> BigInterger 로 극복할 수 있음.
//실수 : 자바에서 실수는 필연적으로 오차가 발생할수 밖에 없음.(비트 기반의 표현식에 의해) --> BigDecimal 로 극복가능


public class BigDecimalClass {

	public static void main(String[] args) {
		double a = 24.3953;
		double b = 50.343998;
//double : 8바이트 실수 자료형 ( 앞의 4바이트는 소수점 윗자리 , 뒤에 4바이트는 소수점 아래
		//비트 기반의 실수 표현은 필연적 오차 발생
		System.out.println(a+b);
		//일반 실수 자료형끼리연산시 : 74.73929799999999 (오차)
		
		//문자열로 데이터를 전달한다!
		/*
		 * 문자열이 아니라 그냥 일반 실수(float)로 전달할 경우 :
		 * 이미 들어가기 전에 자바가 그것을 일반 실수로 인지하여 오차가 존재하는 상태로 BigDecimal에 들어가버림.
		 */
		BigDecimal num = new BigDecimal(String.valueOf(a));
		BigDecimal num2 = new BigDecimal(String.valueOf(b));

		System.out.println(num.add(num2));
		// BigDecimal도 불변(immutable) 클래스이다.
	}

}
