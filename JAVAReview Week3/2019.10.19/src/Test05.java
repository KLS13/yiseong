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
		System.out.print("1~100 사이 >> ");
		int n = scanner.nextInt();
		if (n < 1 || n > 100) {
			throw new NumberOutOfBoundsException("1~100 사이만 입력하세요.");
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
					System.out.println("정답 : " + answer + "(" + count + "번 만에 성공!)");
					break;
				}
			} catch (NumberOutOfBoundsException e) {
				System.out.println(e.getMessage());
			} catch (InputMismatchException e) {
				System.out.println("정수만 입력하세요.");
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

		UpDown game = new UpDown();		// game 객체(인스턴스) 생성 -> 생성자(Constructor) 호출
		game.play();
		
	}

}
