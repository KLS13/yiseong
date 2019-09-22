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
		System.out.println("문자열 데이터 입력 : ");
		base1.data = input.nextLine();
		System.out.println("정수형 데이터 입력 : ");
		base2.data = input.nextInt();
		System.out.println("실수형 데이터 입력 : ");
		base3.data = input.nextDouble();
		
		base1.showYourInput();
		base2.showYourInput();
		base3.showYourInput();
		
		}
		

	}

