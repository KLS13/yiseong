//데이터 : 저장,생성,삭제,참조,변경
// --> 효율적으로 위의 동작 처리
// --> 자료구조 : 데이터를 효율적으로 관리
// 컬렉션 프레임워크 : 자료구조를 클래스로 제공하는 것 
// 1.셋(집합) 2.리스트   3.큐  4.스택  5.맵

public class Basic {
	/*
	 * 해시코드는 내부적인 알고리즘에 의해서 각각의 객체가 가지는 고유의 값.
	 */
	//각각의 객체가 가지는 고유의 값이다
	//알고리즘에 대한 사용자 정의가 가능하다

	public static void main(String[] args) {
		String str1 = "JAVA";
		String str2 = "JAVA";
		String str3 = "C++";
		Integer num1 = 3;
		Integer num2 = 5;
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(num1.hashCode());
		System.out.println(num2.hashCode());
		

	}

}


//hashset : 셋과 컬렉션 인터페이스를 구현
//컬렉션 : 데이터를 수집하는데 필요한 기능들
//대부분의 컬렉션 프레임워크는 다중 구현이 되어있음.