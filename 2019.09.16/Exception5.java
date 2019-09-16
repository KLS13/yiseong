class AgeException extends Exception{
	//생성자 오버로딩
	public AgeException() { }
	public AgeException(String message) { }
}

public class Exception5 {
	//사용자 정의 예외를 던지는 메서드! (예외가 발생할 경우에)
	public static void ticketing(int age) throws AgeException{
		if(age<0) {
			throw new AgeException("나이 입력 잘못");
		}
	}

	public static void main(String[] args) {
		int age = -19;
		try {
			ticketing(age); //AgeException!
		}catch (AgeException e) {
			e.printStackTrace(); //스택을 추적한 것을 출력.
		}

	}

}
