package com.koreait.ex;

import javax.swing.JOptionPane;

public class Test10 {

	public static void main(String[] args) {
		
		String strKg = JOptionPane.showInputDialog("�����Ը� �Է��ϼ���");
		String strheight = JOptionPane.showInputDialog("Ű�� �Է��ϼ���");
		
		double kg = Double.parseDouble(strKg);
		double height = Double.parseDouble(strheight);
		height = height/100;
		double bmi = (kg/height/height);
		
		String bmiResult = bmi >= 25 ? "��ü��" : bmi >= 20 ? "����" : "��ü��";
		System.out.println("����� " + bmiResult + " �Դϴ�.");

	}

}