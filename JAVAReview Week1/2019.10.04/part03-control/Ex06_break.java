package com.koreait.ex;

import javax.swing.JOptionPane;

public class Ex06_break {

	public static void main(String[] args) {
		/*
		 	����
		 	
		 	while(true) {
		 	if(���ǽ�) {
		 	break;
		 	}
		 }
		 
		 	Ư¡
		 	�ݺ����� ��ٷ� ����
		 	switch ��ٷ� ����
		 */
		
		String id;
		while(true) {
			id = JOptionPane.showInputDialog(" ID �Է� >> ");
			if(id.equals("admin")){
					JOptionPane.showMessageDialog(null, "���̵� ��ġ");
					break;
		}else {
			JOptionPane.showMessageDialog(null, "�ٽ� �Է��ϼ���");
			}
		}

	}

}
