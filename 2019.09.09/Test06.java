import java.util.*;
public class Test06 {
//�Է��� �� ���� ���� ������ ����ϱ�.
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,b;
		int a;
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		i = input.nextInt();
		System.out.print("���ڸ� �Է��ϼ��� : ");
		b = input.nextInt();
		
		
		for( a=i; a<=b ; a++) {
			for( int k = 1 ; k<=9 ; k++) {
				System.out.print(a*k + " ");
			}
			System.out.println(" ");
		}

	}

}
