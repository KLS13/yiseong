package com.koreait.ex;

import javax.swing.JOptionPane;

public class Ex01_if {

	public static void main(String[] args) {
		/*
		 if(���ǽ�) {
		 	���๮;
		 	}else if (���ǽ�){
		 	���๮;
		 	}else {
		 	���๮;
		 	}
		 	
		 Ư¡
		  1) else if���� ��� �ǰ�, ���� ���� ���� �� �ִ�.
		  2) else ���� ��� �ǰ�, �� ���� ���� �� �ִ�.
		  3) ���๮�� �ϳ���� ���� ����� �߰�ȣ( {} )�� ������ �� �ִ�.
		  
		 */
		int num = Integer.parseInt(JOptionPane.showInputDialog("������ �Է��ϼ��� >> "));
		
		if(num > 0) {
			JOptionPane.showMessageDialog(null, "���");
		}else if (num==0) {
			JOptionPane.showMessageDialog(null, "ZERO");
		}else {
			JOptionPane.showMessageDialog(null, "����");
		}
	}

}
