package com.koreait.ex;
// ��ü ����(�ν��Ͻ� ����)
// ���ǵ� Ŭ������ �̿��Ͽ� "��ü"�� �����Ѵ�.
// ���� ���
// Ŭ������ ��ü�� = new Ŭ������();
// ��ü(�ν��Ͻ�) ��� ���
	//��ü��.�ʵ��
	//��ü��.�޼ҵ��
/*
 ���� Ŭ����
 	1. ���� �޼ҵ带 ������ �ִ� Ŭ�����̴�.
 	2. ���α׷��� ���۵Ǵ� Ŭ�����̴�.
 	3. ���α׷��� �̸��� �Ǵ� Ŭ�����̴�.
*/
public class BookMain {

	public static void main(String[] args) {
		//1. Book ��ü(�ν��Ͻ�) ����
		
		Book myBook = new Book();
		
		//������ ��ü (myBook) Ȱ��
		myBook.title = "�ڹ��� ����";
		myBook.writer = "���ü�";
		myBook.price = 35000;
		myBook.isBestSeller = true;
		
		myBook.info();
	}

}
