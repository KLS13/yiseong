import java.util.*;
public class TestIf {

	public static void main(String[] args) {
		
		String id = "java";
		String pw = "gaegguljam";
		
		Scanner input = new Scanner(System.in);
		System.out.print("ID�� �Է��ϼ��� : ");
		String inputid = input.nextLine();
		
		
		// id�� inputid�� �Ѵ� String �϶��� equals�� �̿�
		if(id.equals(inputid)) {
			System.out.println("���̵�� �����ϴ�.");
			System.out.print("��й�ȣ�� �Է��ϼ��� : ");
			String inputpw = input.nextLine();
			
			if(pw.equals(inputpw)) {
				System.out.println("���ӿϷ�");
			}else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
		System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
	}
	
	}
}
