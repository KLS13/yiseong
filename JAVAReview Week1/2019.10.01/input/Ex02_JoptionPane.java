package com.koreait.ex;

import javax.swing.JOptionPane;

public class Ex02_JoptionPane {

	public static void main(String[] args) {
	/*
	 JOptionPane Ŭ���� ( �ڹٿɼ��г� )
	   - ������ �Է�â�� ���� �Է�
	   - swing ������Ʈ �̿�(javax.swing) ��Ű�� ��� import.
	   - JOptionPane �޼ҵ�
	         1) �Է�
	         	String ���� = JOptionPane.showInputDialog("�Է¸޼���");
	         2) ���
	         JOptionPane.showMessageDialog(null, "���");
	 */
		
		// ���� ���� ����  �Է� --> ���
	    //�Է�
		String name = JOptionPane.showInputDialog("������ �Է��ϼ���");
		String strAge = JOptionPane.showInputDialog("���̸� �Է��ϼ���");
		String strHeight = JOptionPane.showInputDialog("������ �Է��ϼ���");
		
		int age = Integer.parseInt(strAge);
		double height = Double.parseDouble(strHeight);

		// ���
		JOptionPane.showMessageDialog(null, "���� : " + name +
				", ���� : " + age + ", ���� : " + height);

	}

}
