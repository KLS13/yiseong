import java.util.*;

public class WhileEx {
// Y ��� ���� ���س��� ���縵 ���߱�
	public static void main(String[] args) {
		String inputStr = "";
	
		while(!inputStr.equals("Y")) {
			System.out.print("���縵 �ϳ��� �Է��ϼ��� : ");
			Scanner input = new Scanner(System.in);
			inputStr = input.nextLine();
			
			if(inputStr.equals("Y")) {
				System.out.println("���� �½��ϴ�");
				
			}else{
				System.out.println("���� �ƴմϴ�");	
				
			}
		}
	}
}
