package test;

import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Test02 {
    public static void main(String[] args) {
        String n = JOptionPane.showInputDialog("숫자를 입력하세요");

        System.out.println(NumberFormat.getInstance().format(Integer.parseInt(n)));
    }
}