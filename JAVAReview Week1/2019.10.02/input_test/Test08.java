package com.koreait.ex;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�����Ը� �Է��ϼ��� >> ");
		double kg = input.nextDouble();
		System.out.print("Ű�� �Է��ϼ��� >> ");
		double height = input.nextDouble();
		height /= 100;
		System.out.println(height);
		double bmi = (kg/height/height);
		
		String bmiResult = bmi >= 25 ? "��ü��" : bmi >= 20 ? "����" : "��ü��";
		
		//25�̻� ��ü��  20�̻� ���� �̸� ������
		
		System.out.println("����� " + bmiResult + " �Դϴ�.");

	}

}
