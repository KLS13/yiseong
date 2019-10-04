package com.koreait.ex;

public class Ex01_prmitive_array {

	public static void main(String[] args) {
		/*
		 1. �迭(Array)
		 	- ���� ���
		 		(1) int[] arr = new int[3];  // ���̰� 3�� arr �迭
		 		(2) int arr[] = new int[3];
		 		 	int[] arr;  // �������� arr ����
		 		 	arr = new int[3]; // int 3�� ���� �� �ּҸ� arr �� ����
		 2. �ʱ�ȭ ���
		 		(1) int[] arr = new int[]{10,20,30};
		 		(2) int[] arr = {10, 20, 30};
		 		(3) int[] arr;  
		 			arr = {10, 20, 30}; // �ʱ�ȭ -> �̿� ���� ����� �Ұ����ϴ�
		 3. Ư¡
		 		(1) �迭�� �ε����� 0���� �����Ѵ�.
		 		(2) �迭�� �����Ǹ� �ڵ����� 0���� �ʱ�ȭ�ȴ�.
		 		(3) �迭�� �����Ǹ� �迭�� ���̸� length �ʵ� ������ ����� �� �ִ�.
		 		int[] arr = new int[3];
		 		�迭�� ���� : arr.length == 3
		 		(4) �迭�� �ε��� ��� ������ ����� ArrayIndexOutOfBoundsException ���� Ŭ������ �߻�.
		 */
		
		int[] arr1 = new int[3];
		int[] arr2 = {10, 20, 30};
		
		for(int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		for(int i=0; i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}
		System.out.println(arr1[3]); // �ε��� ������ ��� ���
	}

}
