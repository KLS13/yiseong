package com.koreait.ex;

public class Ex03_exception {

	public static void main(String[] args) {
		// Run - Run configuration �� ���� ���޵� arguments �� String[] args�� �����.
		
		try {
		char gender = (int)(args[0].charAt(7)) % 2 == 1 ? '��' : '��';
		System.out.println(gender);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Run-Run configuration �޴��� ���� �ֹε�Ϲ�ȣ�� �����ϼ��� ");
		}
	}

}
