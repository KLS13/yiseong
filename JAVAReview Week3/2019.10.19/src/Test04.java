import java.util.Scanner;

/*
 �ֹε�Ϲ�ȣ(������ ����)�� �Է� �޾� ����Ͻÿ�. �ֹε�Ϲ�ȣ�� 14���ڰ� �ƴϸ� 
PerIDException Ŭ������ �̿��Ͽ� ���ܸ� ó���Ͻÿ�. �ֹε�Ϲ�ȣ�� �Է� �ޱ� ����
getPerID() �޼ҵ带 �̿��Ͻÿ�.

 */

public class Test04 {
	// Field
		static Scanner scanner = new Scanner(System.in);
		
		// Method
		public static String getID() throws AgeException2 {
			System.out.print("�ֹε�Ϲ�ȣ �Է� >> ");
			String jumin = scanner.nextLine();
			if (jumin.length() < 14 || jumin.length() > 14) {
				throw new AgeException2("14�ڸ��� �Է����ּ���");
			}
			return jumin;
		}
	public static void main(String[] args) {
		
		try {
			String jumin =  getID();
			System.out.println("����� �ֹι�ȣ�� " + jumin + "�̴�.");
		} catch (AgeException2 e) {
			System.out.println(e.getMessage());
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

}