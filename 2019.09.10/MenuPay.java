import java.util.Scanner;

public class MenuPay
{

	public static void main(String[] args) {
		
		int i ;
		int chance = 0;
		String pay = "";
		
	
        while(true){ 
        		
		System.out.println("���Ͻô� �޴��� ��ȣ�� �Է��ϼ���.");
		System.out.println("1.�ܹ��� 2. ���� 3. ġŲ 4. ����� 5. �����ϱ�");
		Scanner input = new Scanner(System.in);
		i = input.nextInt();
		
		if(i==5) {
			System.out.println("�� �ֹ� �Ǽ��� " + chance + " �� �Դϴ�. �����Ͻðڽ��ϰ�?");
			System.out.println("ī������� ī�带 �Է����ּ���.");
			System.out.println("���ݰ����� ������ �Է����ּ���.");
			Scanner input2 = new Scanner(System.in);
			pay = input2.nextLine();
			if(pay.equals("ī��")){
				System.out.println("ī�带 �־��ּ���.");
				System.out.println("----------------");
				System.out.println("-----�ν���------");
				System.out.println("-----������------");
				System.out.println(chance + " �ǿ� ���� ������ �Ϸ�Ǿ����ϴ�.");
			} else if(pay.equals("����")) {
				System.out.println("������ �־��ּ���.");
				System.out.println("----------------");
				System.out.println("-----�ν���------");
				System.out.println("-----������------");
				System.out.println(chance + " �ǿ� ���� ������ �Ϸ�Ǿ����ϴ�.");
			}else {
				System.out.println("�����Դϴ�. ó������ �ٽ� �������ּ���.");
			}
			break;
		}
	
		switch(i) {
			case 1 :
				System.out.println("�ܹ��Ÿ� �ֹ��Ͽ����ϴ�.");
				chance += 1;
				break;
			case 2 :
				System.out.println("���ڸ� �ֹ��Ͽ����ϴ�.");
				chance += 1;
				break;
			case 3 :
				System.out.println("ġŲ�� �ֹ��Ͽ����ϴ�.");
				chance += 1;
				break;
			case 4 :
				System.out.println("������� �ֹ��Ͽ����ϴ�.");
				chance += 1;
				break;

			}		
		}
	}
}
