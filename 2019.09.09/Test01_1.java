import java.util.Scanner;

public class Test01_1 {
//�Է¹��� ���ڸ�ŭ�� �ݺ��ϱ� !
	public static void main(String[] args) {
		
		
		int i;
		int b;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
	
		for(b=i ; b>=1; b--) {
			System.out.println("�ݺ� !");
		}
		System.out.println("��" + i + "ȸ �ݺ��Ͽ����ϴ�.");
	
	}
}
