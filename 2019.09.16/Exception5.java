class AgeException extends Exception{
	//������ �����ε�
	public AgeException() { }
	public AgeException(String message) { }
}

public class Exception5 {
	//����� ���� ���ܸ� ������ �޼���! (���ܰ� �߻��� ��쿡)
	public static void ticketing(int age) throws AgeException{
		if(age<0) {
			throw new AgeException("���� �Է� �߸�");
		}
	}

	public static void main(String[] args) {
		int age = -19;
		try {
			ticketing(age); //AgeException!
		}catch (AgeException e) {
			e.printStackTrace(); //������ ������ ���� ���.
		}

	}

}
