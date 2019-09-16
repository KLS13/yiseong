public class Exception3 {

	public static void methodA() throws Exception{
		//여기서는 예외가 발생하더라도,
		//처리에 대한 책임을 자신을 호출해준 곳으로 넘겨버린다.
		methodB();
	}
	public static void methodB() throws Exception{
		methodC();
	}
	public static void methodC() throws Exception{
		Exception e = new Exception();
		throw e;
	}
	public static void main(String[] args) {
		try {
			methodA();
		}catch(Exception e) {
			System.out.println("메인에서 처리");
		}
	}

}
