import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		int i;
		int sum=0;
		
        while(true) { 
        		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		
			if(i==0) { //���� i�� 0�� ��� break;
			System.out.println("����!" + " " + "������ ����" + " " +  sum);
			break;
			
	     	}else { // �� �ܿ��� sum�� i ���� ����
			sum+=i;  
		}
	  }
   }
}
