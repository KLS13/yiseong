package com.koreait.ex;

public class ManMain {
	
	//main �޼ҵ忡 static �� �ʿ��� ����
	//main �޼ҵ带 �����ϴ� Ŭ������ ��ü(�ν��Ͻ�) �������� main�� ȣ���ϱ� ���ؼ�
	//��) new ManMain() ���� main �޼ҵ��� ȣ���� ���� static �� �ݵ�� �ʿ��ϴ�.

	public static void main(String[] args) {
		Man man = new Man("ȫ�浿",20);
		
		man.output();
		
		// GENDER �ʵ�� static �ʵ��̱� ������ new�� ������� ���ٰ���
		System.out.println(Man.GENDER);
		System.out.println(man.GENDER); //������ ������ ��õX  "�ǹ̾���"
		
		//System.out.println(Man.age); --> static �� Ŭ����. ȣ�Ⱑ��
		System.out.println(man.age); 
		
		
		
	}

}
