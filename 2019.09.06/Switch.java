public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		
		switch(num/2) {
		
		case 1 : 
			System.out.println("���� 1");
			break; // case ���� ������ ����. 
		case 2 :
			System.out.println("���� 2");
			break;
		case 3 :
			System.out.println("���� 3");
			break;
			
			default :  // ��� case�� �ش������ ������
				System.out.println("������");
				break;
		}
	}

}
