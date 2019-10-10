package com.koreait.ex;

import javax.swing.JOptionPane;

public class StaticSample {
	public static void main(String[] args) {
		// 그동안 사용한 static
		System.out.println();
		JOptionPane.showInputDialog("입력메세지");
		JOptionPane.showMessageDialog(null, "출력메세지");
		System.out.println(Math.PI);
		
		//공통점
		//new System,  new JoptionPane --> new가 필요 없다!

	}
}
