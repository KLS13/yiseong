package com.koreait.ex;

import javax.swing.JOptionPane;

public class Test09 {

	public static void main(String[] args) {
		String strkor = JOptionPane.showInputDialog("국어 점수 입력 >> ");
		String streng = JOptionPane.showInputDialog("영어 점수 입력 >> ");
		String strmat = JOptionPane.showInputDialog("수학 점수 입력 >> ");
/*
 int kor = Integer.parseInt(JOptionPane.showInputDialog("국어 점수 입력 >> "));
 int eng = Integer.parseInt(JOptionPane.showInputDialog("영어 점수 입력 >> "));
 int mat = Integer.parseInt(JOptionPane.showInputDialog("수학 점수 입력 >> "));
 */
		
		int kor = Integer.parseInt(strkor);
		int eng = Integer.parseInt(streng);
		int mat = Integer.parseInt(strmat);
		
		double avg = (kor+eng+mat)/3.0;
		
		String grade = avg>90 ? "A학점" : avg > 80 ? "B학점" : avg >70 ? "C학점" : avg > 60? "D학점" : "F학점";


		JOptionPane.showMessageDialog(null, "평균점수는 " + avg + ", 학점은 " + grade );
	}

}
