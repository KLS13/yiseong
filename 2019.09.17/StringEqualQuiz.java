import java.util.*;
//������ ���̵�� �н����尡 �ִ� ���¿���  ������Է�
//�Ƶ� �����ް� �Ƶ� ��ġ�� ��� ��и�ȣ�� ����
//��� ���߾��� �� ���α׷��� "�α��� ����"
//������ ���ϸ� " �α׸� ����" �ٽ� �Է��ϰ��ϸ� �� ��ȸ�� 5��
//5�� ���н� ����



public class StringEqualQuiz {

	public static void main(String[] args) {
		String id = "java";
		String pw = "pw1234";
		int chance = 5;
		Scanner input = new Scanner(System.in);
		
		while(chance !=0) {
			System.out.println("id�Է�");
			String inputId = input.nextLine();
			if(id.equals(inputId)) {
				System.out.println("pw�Է�");
				String inputPw = input.nextLine();
				
				if(pw.equals(inputPw)) {
					System.out.println("�α��� ����");
					break;
				}else {
					System.out.println("�α��� ����!");
				}
			}else {
				System.out.println("�α��ν���");
			}
			System.out.println("������ȸ : " + --chance);
	 	}
	}
}


