import java.util.*;

class ElseIfInPut {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Scanner �� Ŭ������ ����.
		// input�� �Է��� �޴� �� ���̴� ����.
		int age;
		System.out.print("���̸� �Է��ϼ��� : ");
		age = input.nextInt();
		//���������� ���� �Է¹޾Ƽ� age�� �����ϰڴ�.
		
		System.out.println("����� �Է��� ���̴� " + age);
		
		if( age >= 20) {
			System.out.println("�����Դϴ�.");
			System.out.println("����� 1250�� �Դϴ�.");
		}else if ( age<20 && age>=14 ) {
			System.out.println("û�ҳ��Դϴ�.");
			System.out.println("����� 750�� �Դϴ�.");
		}
		System.out.println("����Դϴ�.");
		System.out.println("����� 500�� �Դϴ�.");

	}
}
