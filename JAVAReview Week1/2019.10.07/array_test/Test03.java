package com.koreait.test;

public class Test03 {

	public static void main(String[] args) {
		
		int[] arr = {5, 2, 6, 3, 7, 8, 9};
		boolean changed;
		/*
		 ���� ��Ʈ(��ǰ����)
		 �յ� ��Ҹ� ��� ���Ѵ�.
		 ���� ���� ũ�� ��ȯ : ��������
		 ���� ���� ũ�� ��ȯ : ��������
		 */
		
		for(int i=0; i<arr.length-1;i++) {
			changed = false; // ��ȯ������ ����.
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) { // ����(>)/���� ����(<)
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]=temp;
					changed = true; //��ȯ������ �ֵ�.
				}
			}
			if(!changed) { // ��ȯ�Ȱ� ���ٸ� �׸� !
				break;
			}
		}
		for(int num : arr) {
			System.out.print(num + "\t");
		}
	}
}
