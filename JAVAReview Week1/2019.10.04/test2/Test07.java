package com.koreait.test2;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		int sum=0;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("������ �Է��ϼ��� (1) >> ");
		int num1 = input.nextInt();
		System.out.print("������ �Է��ϼ��� (2) >> ");
		int num2 = input.nextInt();
		
		if(num1<num2) {
		for(int i= num1; i<=num2; i++) {
			sum=sum+i;
			}
		System.out.println(sum);
		}else if(num2<num1) {
			for(int i=num2; i<=num1; i++) {
				sum=sum+i;
			}
			System.out.println(sum);
		}else{
			if(num1==num2) {
				System.out.println("�Է¹��� ������ ����.");
			}
		}
			input.close();
		}
		}
/*
 	Scanner scanner = new Scanner(System.in);
		
		int total = 0;
		int start;
		int end;
		
		// 1. �ϴ� �Է�
		System.out.print("ù ��° ���� >> ");
		start = scanner.nextInt();
		System.out.print("�� ��° ���� >> ");
		end = scanner.nextInt();
		
		// 2. start, end ũ�� ��
		// ������ start <= end �ǵ��� �����ϱ� ����
		// start > end �� ��� �� ������ "��ȯ"
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		
		for (int num = start; num <= end; num++) {
			total += num;
		}
		
		System.out.println(start + "~" + end + "�� �� : " + total);
		
		scanner.close();
		
	}

}



 */
	


