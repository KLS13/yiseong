package com.koreait.test2;

import javax.swing.JOptionPane;

public class Test04 {

	public static void main(String[] args) {
		
		for(int i=1; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println(" ");
		}
		
		String message = " ";
		for(int num =1; num<=9; num++) {
			for(int dan=2; dan <=9; dan++) {
				message += (dan+"*"+num+"="+dan*num+"\t \t \t \t \t \t \t \t");
			}
			message += "\n";
		}
		JOptionPane.showMessageDialog(null, message);

	}

}
