package com.koreait.ex;

import javax.swing.JOptionPane;

public class Test09 {

	public static void main(String[] args) {
		String strkor = JOptionPane.showInputDialog("���� ���� �Է� >> ");
		String streng = JOptionPane.showInputDialog("���� ���� �Է� >> ");
		String strmat = JOptionPane.showInputDialog("���� ���� �Է� >> ");
/*
 int kor = Integer.parseInt(JOptionPane.showInputDialog("���� ���� �Է� >> "));
 int eng = Integer.parseInt(JOptionPane.showInputDialog("���� ���� �Է� >> "));
 int mat = Integer.parseInt(JOptionPane.showInputDialog("���� ���� �Է� >> "));
 */
		
		int kor = Integer.parseInt(strkor);
		int eng = Integer.parseInt(streng);
		int mat = Integer.parseInt(strmat);
		
		double avg = (kor+eng+mat)/3.0;
		
		String grade = avg>90 ? "A����" : avg > 80 ? "B����" : avg >70 ? "C����" : avg > 60? "D����" : "F����";


		JOptionPane.showMessageDialog(null, "��������� " + avg + ", ������ " + grade );
	}

}
