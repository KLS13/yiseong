package com.koreait.ex;
/*
 Ŭ����(class)
  1. ��ü������� "��ü"�� ����� �����̴�.
  2. "��ü"�� ����� ���赵�̴�.
  3. "��ü(object)", "�ν��Ͻ�(instance)"
  4. ���� �� ����
          Ŭ����         		 ��ü(�ν��Ͻ�)
           ���	     	 ö��,����,���� ��
           �ؾ ����� ���    �ؾ
  5.
         ���� => �ʵ�
         �Լ� => �޼ҵ�
 */
public class Book {
	String title;
	String writer;
	int price;
	boolean isBestSeller;
	
	void info() {
		System.out.println("���� : " + title);
		System.out.println("���� : " + writer);
		System.out.println("���� : " + price);
		System.out.println(isBestSeller ? "����Ʈ����" : "�Ϲ� ����");
	}
}
