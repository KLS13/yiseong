package com.koreait.ex;
import java.util.*;
public class Test02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int age;
		
		System.out.print("���� �Է� : ");
		age = input.nextInt();
		
		String message = (age >= 20) ? "����" : "�̼�����";
		System.out.println(message);
		
		input.close();
	}

}
