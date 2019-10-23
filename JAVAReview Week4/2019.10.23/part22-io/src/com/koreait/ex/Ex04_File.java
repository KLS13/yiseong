package com.koreait.ex;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_File {

	public static void main(String[] args) {
		
		File file = null;		// File Ŭ������ �߰��ϸ� ���� ���� �޼ҵ带 ����� �� �ִ�.
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			file = new File("myFile.txt");
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			
			char ch = 'a';
			while (true) {
				bos.write(ch);
				if (ch == 'z') {
					break;
				}
				ch++;
			}
			
			// File Ŭ���� ������� ����� ������ �޼ҵ�
			System.out.println("���ϸ� : " + file.getName());
			System.out.println("���1 : " + file.getAbsolutePath());
			System.out.println("���2 : " + file.getPath());
			if (file.exists()) {
				System.out.println("������ �ֽ��ϴ�.");
				file.delete();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) { bos.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
