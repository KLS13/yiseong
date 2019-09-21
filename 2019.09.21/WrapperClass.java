import java.util.*;
//객체지향언어 : 객체들이 구성하는 소프트웨어를 만들고 싶을때 쓰는 언어
public class WrapperClass {

	public static void main(String[] args) {
		//래퍼클래스 : 기본 자료형을 객체로 묶어줌
		//기본자료형이란, int double, long, char
		//int a = 3;//일반변수는 대체적으로 값을 가짐
		
		//5 라는 값을 래퍼클래스로 감싸보자 !!
		
		//Integer num1 = new Integer(5);
		//Double num2 = new Double(3.14);
		// --> 박싱
		
		//int fromNum1 = num1.intValue();
		//감싸져있던 5라는 값을 꺼내어 반환해준다
		//double fromNum2 = num2.doubleValue();
				//--> 언박싱
		
		//int thirtyOne = Integer.parseInt("31");
		///System.out.println(thirtyOne);
		
		
		
		//String two = Integer.toString(2);
		//정수를 문자열로 바꿔주고 싶다!
		
				
	   // Integer num3 = Integer.valueOf("31");
 		//문자열을 래퍼클래스로.  "31"이 정수 31로 바뀜
	    //그런다음에 박싱된다.
	    
	    //Integer num4 = 10;// int값을 num4에 그냥 박음 --> 자기가 알아서 박싱을 하게 된다
	                      // Integer num4 = new Integer(10);  이것과 동일  "오토 박싱"
	    
	    //int fromNum4 = num4.intValue(); //언박싱
	                                    // int fromNum4 = num4;  이것과 동일  "오토 언박싱"
	    
	   // System.out.println(Long.MAX_VALUE);
	    //long(8바이트) 이라는 자료형으로 표현할수  값의범위 : 64비트만큼
	    
	    //래퍼클래스는 물론 좋다! BUT 일반자료형에 비해서 메모리를 많이 차지한다.
	    //따라서 꼭 필요한 경우가 아니라면 그냥 일반자료형을 사용하는 것이 메모리 절약에 좋다
	    //좋은 프로그램의 조건
	     /* 연산횟수가 적을수록
	      * 메모리가 적게 차지할수록
	      * 코드가 읽기 좋게 작성
	      */
	    
		System.out.println(System.currentTimeMillis());
		//1970년 1월 1일 0시 이후로 몇 ms가 흘렀는지 반환
		//long형으로 반환
		Scanner input = new Scanner(System.in);
		//시스템상에 입력을 받도록 하겠다.
		
		
	}

}
