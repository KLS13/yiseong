//�ʱ�� �Ǳ� ���� �Է� --> �հ� ���� ����ϱ� -->  �ʱ�,�Ǳ� 70�̻� �Ǵ� ����� 80 �̻� --> �հ�   �ƴϸ� ���հ�
package com.koreait.test;
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("�ʱ����� �Է� : ");
		int score1 = input.nextInt();
		System.out.print("�Ǳ����� �Է� : ");
		int score2 = input.nextInt();
		
		if( (score1 >=70 && score2 >=70) ||(score1 + score2)/2.0 >=80) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
	}
}
