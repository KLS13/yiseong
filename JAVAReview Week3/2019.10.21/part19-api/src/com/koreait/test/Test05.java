package ssss;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
	
		System.out.print("���� �Է��ϼ��� >>");
		String input1 = input.next();
		System.out.print("�̸��� �Է��ϼ��� >>");
		String input2 = input.next();
		
		sb1.append(input1).append(input2);
		
		System.out.println(sb1);
		
		System.out.print("���� �Է��ϼ��� >>");
		String input3 = input.next();
		System.out.print("�̸��� �Է��ϼ��� >>");
		String input4 = input.next();
		
		sb2.append(input3).append(input4);
		
		System.out.println(sb2);
		
		if((sb1.toString()).equals(sb2.toString())) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
	}
}




