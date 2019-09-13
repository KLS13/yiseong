package Study;
import packageTest.Hello; // import 패키지명.클래스명

public class CallHello {

	//다른 패키지에 있는 클래스를 사용
	public static void main(String[] args) {
		
		packageTest.Hello.sayHello();
		packageTest.Hello.sayBye();
		
		//패키지명.클래스명.메서드명();
		
		//위와 같이 하면 귀찮음. --> 실수유발
		//해결책 : package를 사용하겠다는 선언을 먼저.  import packageTest.Hello;
		
		Hello.sayHello();
		Hello.sayBye();
		
		// package 별로 클래스를 구분해두었을 때의 이점
		// 파트별로 코드를 보기가 편함. 따라서 수정할 때에도 수월
		// 패키지 관리를 잘하면 있어보임

		
		
	}

}
