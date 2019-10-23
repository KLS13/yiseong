package com.koreait.ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_FileCopy {

	public static void main(String[] args) throws IOException {

		// ���� �ҽ� ������ "�о�"���δ�.
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("alphabet.txt"));
		
		// ���纻 ������ "����"�Ѵ�.
		FileOutputStream fos = new FileOutputStream("alphabet2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// int data = bis.read();	// read() �� -1 �϶� ��
		int data;
		while ( (data = bis.read()) != -1 ) {
			bos.write(data);
		}
		
		bis.close();
		bos.close();
		fos.close();	// ���ʿ� (���� ��Ʈ���� ������ �ڵ����� ������
		
	}
}
