//���̰� 5, ����ڷκ��� �Է� --> �� ���
package com.koreait.test;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		// 1. �Ϲ� for��
		for ( int i=0; i<arr.length; i++) {
			System.out.print(i + 1 + "��° �Է� >> ");
			arr[i]=input.nextInt();
		}
		for( int num : arr) { // arr �迭�� �� ��Ҹ� num ������ �����ؼ� ó��
			sum += num;			
		}
		System.out.println(sum);
		input.close();
	}
}
/*
 	int[] arr = new int[5];
		int total = 0;
		
		for (int i = 0; i < arr.length; i++) {
			// 1. �Է�
			System.out.print("���� �Է� >> ");
			arr[i] = scanner.nextInt();
			// 2. �հ�
			total += arr[i];
		}
		
		System.out.println("�� : " + total);
		
		scanner.close();
		
	}

}
*/
