package com.koreait.ex;
import java.util.Scanner;

public class Ex03_string_array {

	public static void main(String[] args) {
		/*
		 string �迭
		 	���ڿ��� ���� �� �����ϱ� ���ؼ� ���
		 	�Ϲ������� �� �� ���ڿ��� ����Ǹ� ������ ���� ����.
		 	������ ���� ���ٸ� for-each���� Ȱ��
		 */
		Scanner input = new Scanner(System.in);
		String [] names = new String[3];
		int j=0;
		
		for(int i = 0; i<names.length; i++) {
			System.out.print("���� �Է� >> ");
			names[i] = input.nextLine();
		}
		
		for(String str : names) {
			System.out.println("names["+j+"] = " + str);
			j++;
		}
		
		input.close();
		
		String[] friends = new String[] {"alice", "james", "tom"};
		String[] hobbies = {"�", "����", "��ȭ"};
		
		for(String friend : friends) {
			System.out.println(friend);
		}
		for(String hobby : hobbies) {
			System.out.println(hobby);
		}
	

	}

}
