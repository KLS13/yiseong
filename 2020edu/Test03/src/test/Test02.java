package test;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Test02 {
    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog("���ڸ� �Է��ϼ���");

        System.out.println(NumberFormat.getInstance().format(Integer.parseInt(n)));
    }
}