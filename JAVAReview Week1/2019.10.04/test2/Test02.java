package com.koreait.test2;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test02 {

	public static void main(String[] args) {
/*		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� >>");
		int num = input.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(num+"*"+i+"="+ num*i);
		}
	}
}*/
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("������ �Է��ϼ��� >> "));
		for(int i=1; i<=9; i++) {
			JOptionPane.showMessageDialog(null, a+"*"+i+"="+a*i);
		}
		

			
				
			}

		}


	
