public class ReView {

	public static void main(String[] args) {
		// if , else if , switch ����
		int num = 3;
		
		if(num ==3) {
			System.out.println("��!");
		}
		
		if(num ==3) {
			System.out.println("��!");
		} else {
			System.out.println("����!");
		}
		
		if(num == 3) {
			System.out.println("3�̾�!");
		}else if( num ==2) {
			System.out.println("2��");
		}else if( num ==1) {
			System.out.println("1�̾�");
		}else {
		    System.out.println("�ƹ��͵� �ƴ�");
		}

		switch(num) {
		case 1 :
			System.out.println("1��");
			break;
		case 2 :
			System.out.println("2��");
			break;
		case 3 :
			System.out.println("3��");
			break;
		default :
			System.out.println("�ƹ��͵� �ƴ�");
			break;
		}
		
		
		}
}
