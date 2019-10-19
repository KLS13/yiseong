import java.util.Scanner;
/*
 Test03.java
���̸� �Է� �޾� ����Ͻÿ�. ���̰� 0~150 ������ ������ ����� AgeException Ŭ������ �̿��Ͽ�
���ܸ� ó���Ͻÿ�. ���̸� �Է� �ޱ� ���� getAge() �޼ҵ带 �̿��Ͻÿ�.
 */
class Person {
	int age;
	Scanner scanner = new Scanner(System.in);
	Person() {	}
	
	public void getAge() throws AgeException{
		
		System.out.print("���̸� �Է��ϼ��� >> ");
		this.age = scanner.nextInt();
		if(age>=0 && age<=150) {
			System.out.println(this.age);
		}else {
			throw new AgeException(1000, "���̴� 0~150�� ���� ���� �Է����ּ���. ");
		}
	}
}	
	
class AgeException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private int errCode;
	
	public AgeException(int errCode, String message) {
		super(message);
		this.errCode = errCode;
	}
	public int getErrCode() {
		return errCode;
	}
}

public class Test02 {

	public static void main(String[] args) {
	
		Person person = new Person();
		try {
			person.getAge();
		} catch (AgeException e) {
			System.out.println("�����ڵ� " + e.getErrCode() + " :: " + e.getMessage());
		}
	}
}



