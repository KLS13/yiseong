import java.util.*;
//split : ������ !
public class StringSplit {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String msg = "���� �̸��� �������� �и��Ͽ� �Է� ";
		String firstName = " ";
		String lastName = " ";
		
		System.out.println(msg);
		String name = input.nextLine();
		//contains : �� ���ڿ� ����?  true or false
		//�� ���ڿ��� �������� ���ڿ��� �߶�. �׷� ���� �迭�� ��ȯ
		if(name.contains("")) {
			String[] strarr = name.split(" ");
			firstName = strarr[0];
			lastName = strarr[1];
			System.out.println("����������");
			System.out.println(firstName + lastName);
		}else{
			System.out.println("������ �����");
			System.out.println(name);
		}
	}
}
