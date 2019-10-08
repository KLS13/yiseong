package com.koreait.ex;

public class Book {

	// Field
	String title;
	String writer;
	int price;
	int salesVolume;		// �Ǹŷ�
	boolean isBestSeller;	// �Ǹŷ��� 1000 �̻��̸� true, �ƴϸ� false
	
	// Constructor
	Book() {}
	Book(String _title, int _price) {
		title = _title;
		writer = "�۰��̻�";
		price = _price;
	}
	Book(String _title, String _writer, int _price) {
		title = _title;
		writer = _writer;
		price = _price;
	}
	
	// Method
	void setSalesVolume(int sales) {
		salesVolume = sales;
		isBestSeller = sales >= 1000 ? true : false;
	}
	void output() {
		System.out.println("���� : " + title);
		System.out.println("���� : " + writer);
		System.out.println("���� : " + price);
		System.out.println("�Ǹŷ� : " + salesVolume);
		System.out.println(isBestSeller ? "����Ʈ����" : "�Ϲݼ���");
	}
	
}
