import java.util.Scanner;

class AgeException2 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AgeException2(String message) {
		super(message);
	}
}

public class Test03 {
	
	// Field
	static Scanner scanner = new Scanner(System.in);
	
	// Method
	public static int getAge() throws AgeException2 {
		System.out.print("나이 입력 >> ");
		int age = scanner.nextInt();
		if (age < 0 || age > 150) {
			throw new AgeException2("나이는 0~150 사이이다.");
		}
		return age;
	}

	public static void main(String[] args) {
		try {
			int age = getAge();
			System.out.println("당신의 나이는 " + age + "살이다.");
		} catch (AgeException2 e) {
			System.out.println(e.getMessage());
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

}
