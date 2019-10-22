package com.koreait.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Board {
	
	// Field
	private String title;
	private String content;
	private Date register;
	
	// Constructor
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
		this.register = new Date();
	}
	
	// Method
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("���� : ").append(title).append("\n");
		sb.append("���� : ").append(content).append("\n");
		sb.append("����� : ").append((new SimpleDateFormat("yyyy�� MM�� dd��")).format(register)).append("\n");		// 2019�� 10�� 22�� 
		return sb.toString();
	}
	
}

public class Test01 {

	public static void main(String[] args) {

		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board("��������", "�������� �о� ����") );
		list.add(new Board("�˸�", "�˸� �о� ����"));
		list.add(new Board("��û", "��û �о� ����"));
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Խù� ��ȣ��? >> ");
		int idx = scanner.nextInt();
		
		if (idx <= list.size()) {
			list.remove(idx - 1);
		}
		
		System.out.println(list);
		
		scanner.close();
		
	}

}















