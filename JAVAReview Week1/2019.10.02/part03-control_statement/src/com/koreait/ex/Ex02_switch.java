package com.koreait.ex;

import javax.swing.JOptionPane;

public class Ex02_switch {

	public static void main(String[] args) {
		/*
		 ����
		 	switch( ǥ���� ) {
		 	case �� 1 : ���๮;
		 		break;
		 	case �� 2 : ���๮;
		 		break;
		 	default : ���๮;
		 	}
		 	
		 Ư¡
		 ǥ������ �����  ����,����,���ڿ��� �����ϴ�.
		   switch(var) {
		   case >= 10;  (X)
		   case 10  :   (O)
		   case 1.5 :   (X)
		   case '��':    (O)
		   case "admin" (O)
		   }
		 */
		int num = Integer.parseInt(JOptionPane.showInputDialog("���̸� �Է��ϼ���"));

		switch(num/10) {
		case 0:
		case 1: 
			JOptionPane.showMessageDialog(null, "�̼�����");
			break;
		default:
			JOptionPane.showMessageDialog(null, "����");
			break;
		}			
	}
}

