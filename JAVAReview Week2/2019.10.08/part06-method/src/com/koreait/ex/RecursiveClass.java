package com.koreait.ex;
/*
 ��� ȣ�� (recursive call)
 	1. �޼ҵ尡 �ڽ��� ȣ���� ��
 	2. �ݺ����� ó��, ������ �˰��� ó��
 	3. �߸� �����ϸ� ���ѷ���
 */
public class RecursiveClass {
	
	//Field
	static int count = 0;
	
	//method
	static void recursive() {
		System.out.println("recursive() call");
		if(++count == 5) {
			return; // recursive ����
		}
		recursive();  // ���ȣ�� ( �ڱⰡ �ڱ⸦ �θ� ) 
		
	}
	

	public static void main(String[] args) {
		recursive();

	}

}
