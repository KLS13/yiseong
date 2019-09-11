class Methods{
	// " y = x + 6 "
	int method1(int x) { // int 형 데이터를 하나 입력함   ex) 2개 입력시   "int method1(int x, int y)"
 		int y = x + 6;
		return y;
		
	} //1. 반환형(int) : 결과값의 자료형
	  //2. 메서드명(method1) : 메서드의 이름(사용자가 지어준 메서드명)
	  //3. (int x) 는 입력값 --> 메서드에 전달해 줄 입력값의 형태를 정함.
     //4. return : 결과값 내보내기(반환)
      // 메서드는 특정한 작업을 수행하기 위해 만든 기능 상자!
      // 메서드는 입력값을 바꿔가면서 아무때나 사용할 수 있다.

	int method2(int x, int z) {
		int y = x + z;
		return y;
	}
}
public class MethodSample {
	//프로그램이 시작되는 곳!
	public static void main(String[] args) {
		Methods method1 = new Methods();
		Methods method2 = new Methods();
		// Methods 클래스로 객체를 만들고 그것을 method1 이라는 참조 변수로 가리키면 됨.
		

		System.out.println(method1.method1(8));
	
		//method1 이 가리키고 있는 객체 안에는 method1 이라는 이름의 메서드가 존재함.
		//그리고 그것을 사용함.
		//이때, 8 이라는 값을 전달하라는 얘기.
		System.out.println(method1.method1(7));
		System.out.println(method1.method1(3));
		
		System.out.println(method2.method2(8,8));  
		System.out.println(method2.method2(7,9));  
		
		// Tip1 . 클래스명은 대문자로 시작하는게 보통
		// Tip2 . 메서드명은 소문자로 시작하는게 보통
		// Tip3 . 메서드명을 지을 때는, 기능이 짐작가야 한다.
		//        ex) int add(int x, int z) {int y = x + z; return y;}  덧셈기능인것을 짐작.
	
	}

}

		//메서드에는 4가지 형태가 존재한다.
		// ?? : 입력값과 결과값은 선택적으로 존재하기 때문.
		/* 1.입력값과 결과값이 다 존재하는 경우
		 * 2.입력값은 있는데 결과값은 없는 경우
		 * 3.입력값은 없는데 결과값이 있는 경우
		 * 4.입력값도 결과값도 없는 경우 */
