import java.math.BigInteger;  // 일반 자료형으로 표현할 수 있는 정수보다 더 큰 값을 표현하고 싶을때 사용.
//정수 : 자바에서 표현을 할 수 있는 한계값이 존재 (long형의 최대값) --> BigInterger 로 극복할 수 있음.
//실수 : 자바에서 실수는 필연적으로 오차가 발생할수 밖에 없음.(비트 기반의 표현식에 의해) --> BigDecimal 로 극복가능

// 불변(immutable) 클래스이다.
public class BigIntergerClass {

	public static void main(String[] args) {
		
		System.out.println("Long's MAX : " + Long.MAX_VALUE);
		System.out.println("Long's MIN : " + Long.MIN_VALUE);
		
		BigInteger big1 = new BigInteger("92233720368547758070");
		BigInteger big2 = new BigInteger("10000000000000000000");
		//문자열 형태로 정수를 전달 !
		//정수가 쓰여 있으면 자바가 알아서 int나 long으로 판단해버린다.
		//그러면 BigInteger가 알아서 정수로 변환하고 감싼다.
		
		BigInteger big3 = big1.add(big2);
		System.out.println("덧셈결과 : " + big3);
		
		BigInteger big4 = big1.multiply(big2);
		System.out.println("곱셈결과 : " + big4);
		
		try {
		int num = big1.intValueExact();
		System.out.println("From BigInterger :" + num);
	}catch(Exception e) {
		System.out.println("예외");
	}
//주의사항 : 일반 자료형에 비해 메모리 차지 많이함.  남용X
}

}