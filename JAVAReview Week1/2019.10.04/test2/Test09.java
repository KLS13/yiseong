package com.koreait.test2;

import java.util.Scanner;

import javax.swing.JOptionPane;

//�α��� �ùķ��̼�
// ���̵� : admim  ��й�ȣ : 1234; �α���
// �Ƶ��Է� ������ ��й�ȣ �Է�
// ���̵� �Է½��� --> ���̵� �ٽ��Է�
// ��й�ȣ �Է� ���� --> �α��� ����
// ��й�ȣ ���� --> �ٽ� ��й�ȣ �Է� ( Ƚ�� ���� 5ȸ ) --> 5ȸ �ʰ��� ��й�ȣ �Է� Ƚ�� �ʰ� �޽��� "���"
public class Test09 {

	public static void main(String[] args) {
	
		
		String id;
		String pw;
		final int MAX_COUNT = 5;
		int count=0;

		do {
			id = JOptionPane.showInputDialog("ID �Է� >> ");
		} while(!id.equals("admin"));
		
		//��й�ȣ ó��
		do {
			count++;
			if( count > MAX_COUNT) {
				JOptionPane.showMessageDialog(null, "��й�ȣ �Է�Ƚ�� �ʰ�");
				//return;  main �޼ҵ��� ����
				System.exit(0); // �ý��� ��������  or  return --> �� ���� �߿� �ϳ�.
			}
			pw = JOptionPane.showInputDialog("PW �Է�(�ִ� 5ȸ) >> ");
		}while(!pw.equals("1234"));
		
		//�α��� ����
		JOptionPane.showMessageDialog(null, "�α��� ����!");
	}
}
