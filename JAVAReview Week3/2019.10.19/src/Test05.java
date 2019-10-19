import java.util.InputMismatchException;
import java.util.Scanner;

class UpDown {
	
	// Field
	private int answer;
	private int count;
	private Scanner scanner = new Scanner(System.in);
	
	// Constructor
	public UpDown() {
		answer = (int)(Math.random() * 100) + 1;
	}
	
	// Method
	public int challenge() throws NumberOutOfBoundsException, InputMismatchException {
		count++;
		System.out.print("1~100 ���� >> ");
		int n = scanner.nextInt();
		if (n < 1 || n > 100) {
			throw new NumberOutOfBoundsException("1~100 ���̸� �Է��ϼ���.");
		}
		return n;
	}
	
	public void play() {
		while (true) {
			try {
				int n = challenge();
				if (answer < n) {
					System.out.println("Down!");
				} else if (answer > n) {
					System.out.println("Up!");
				} else {
					System.out.println("���� : " + answer + "(" + count + "�� ���� ����!)");
					break;
				}
			} catch (NumberOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("������ �Է��ϼ���.");
				clearInputBuffer();
			}
		}
	}
	public void clearInputBuffer() {
		scanner.next();
	}
	
}

class NumberOutOfBoundsException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public NumberOutOfBoundsException(String message) {
		super(message);
	}
}

public class Test05 {

	public static void main(String[] args) {

		UpDown game = new UpDown();		// game ��ü(�ν��Ͻ�) ���� -> ������(Constructor) ȣ��
		game.play();
		
	}

}
