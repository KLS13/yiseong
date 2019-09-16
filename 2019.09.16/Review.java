// 내부클래스 : 클래스 안에 있는 클래스 (중첩클래스)

class Outer{
	class Inner{
		//이것이 내부클래스
	}
}

class Girl{
	void sayHello() {
		System.out.println("안녕");
	}
}
////////내부클래스의 종류/////////
// 1. 인스턴스 클래스 (다른 인스턴스 멤버와 거의 동일)
// 2. 스태틱 클래스 ( static - 객체생성하지않아도 접근O , 모든객체공유 )
// 3. 지역 클래스 (한정된 지역 내(메서드 내부)에서만 유효 )

// 익명 클래스 : 원래의 형태대로 사용하지 않는 일시적인 클래스
public class Review {

	public static void main(String[] args) {
		Girl girl1 = new Girl();
		girl1.sayHello();
		
		Girl chineseGirl = new Girl() {
			// 이처럼 정의하는것이 익명클래스
			// 오버라이딩 가능!
			void sayHello() {
				System.out.println("NiHao");
			} // 1회성
		};
		chineseGirl.sayHello();
		
		//배열인덱스 오류
		int[] arr = new int[3];
		arr[5] = 3; // 잘못이 있어보이긴하나, 문법은 맞음  ArrayIndexOutOfBoundsException
		}
		
		
	}

////////////////////////////////////////
// 예외처리(Exception)
// 오류(Error) - 프로그램을 실행할 수 없게 만드는 문제!
// --> 문법적인 오류가 가장 흔함.