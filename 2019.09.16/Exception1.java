public class Exception1 {

	public static void main(String[] args) {
		try {
			int[] a = {2,0};
			int b = 4/0;
			int c = b/a[0];
			System.out.println(c);
			
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 길이 오류 발생");
		}finally {
		System.out.println("예외 처리 공부중1");

		} // finally 안의 문장은 무조건 실행.
		  // 단, try catch가 끝나고 나서.
		System.out.println("예외 처리 공부중2");
	}
	
	// 자바의 모든 예외는 객체다. 그리고 예외 객체들의 조상으로는 Exception이 있다.
	// 따라서 어떤 예외가 오더라도, catch문에서는 Exception으로 참조가 가능하다 !
	// --> 다형성의 정의는 여기에도 적용이 된다.

}
