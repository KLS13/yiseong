import java.util.Scanner;

class Basic<T>{
	T data;
	void showYourInput() {
		System.out.println("ur data is : " + data);
	}
}
public class GenericBasicQuiz {

	public static void main(String[] args) {
		Basic<String> base1 = new Basic<String>();
		Basic<Integer> base2 = new Basic<Integer>();
		Basic<Double> base3 = new Basic<Double>();
		
		Scanner input = new Scanner(System.in);
		System.out.println("���ڿ� ������ �Է� : ");
		base1.data = input.nextLine();
		System.out.println("������ ������ �Է� : ");
		base2.data = input.nextInt();
		System.out.println("�Ǽ��� ������ �Է� : ");
		base3.data = input.nextDouble();
		
		base1.showYourInput();
		base2.showYourInput();
		base3.showYourInput();
		
		}
		

	}

