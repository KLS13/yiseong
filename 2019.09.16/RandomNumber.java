import java.util.InputMismatchException;
import java.util.Scanner;
public class RandomNumber {

	//�������� ��ȣ�� ������.
	
	public static void main(String[] args) {
	
		int answer = (int)(Math.random()*100)+1;
		int input = 0;
		int count = 0;
		

		
		do {
			count++;
			
			System.out.println("input number in 1~100");
			try {
				//���ܰ� �߻��� ��� ó���� ����
				input = new Scanner(System.in).nextInt();
			}catch(InputMismatchException e) {
				System.out.println("�ٽ�  �Է�"); 
				continue; 	
			}
				
			
			if(answer > input) {
				System.out.println("��");
			}else if(answer < input) {
				System.out.println("�ٿ�");
			}else {
				System.out.println("Correct");
				System.out.println("u tried " + count);
				break;
			}
		
		
	
		}
		
		while(true);
		
		
		
		//1~100 ������ �������� ���߱�
		//1. �������� ���ڸ� ����� �����ص�.
		//2. ����� �Է��� �ޱ�(����ڰ� ������ ������)
		 //--> ������ �ƴ� �̻��� �� �Է��ϸ� ����
		//3. ���ϱ� -> ������ �´�, Ʋ���� Ʋ����
		//4. ���� ��쿡�� �´ٰ��ϰ� ����.  �׷��� Ʋ���� �ٽ�!
		
	}

}

