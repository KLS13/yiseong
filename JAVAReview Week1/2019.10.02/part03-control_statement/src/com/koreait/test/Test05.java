//�����Է�  �빮�� �ҹ���  ����  �Ϲݹ���
package com.koreait.test;
import java.util.*;

public class Test05 {
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("�Է� : ");
			int str = input.nextLine().charAt(0);

			if(str >= 65 && str <=90) {
				System.out.println("�빮�� �Դϴ�.");
			}else if(str >=91 && str <=122) {
				System.out.println("�ҹ��� �Դϴ�.");
			}else if(str>=48 && str <=64){
				System.out.println("���� �Դϴ�.");
			}else {
				System.out.println("�Ϲ� ���� �Դϴ�.");
			}
			input.close();
			
		}
}