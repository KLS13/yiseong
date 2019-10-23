package com.koreait.ex;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02_FileInput {

	public static void main(String[] args) {

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("alphabet.txt");
			bis = new BufferedInputStream(fis);
			int ch = 0;		// char ch; �� �ƴ��� ������ ��!
			
			while (true) {
				ch = bis.read();	// read() �޼ҵ��� ������ int type �̴�!
									// read() �޼ҵ�� ������ ������ -1�� ����
				if (ch == -1) {
					break;
				}
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bis != null ) { bis.close(); }
				if (fis != null ) { fis.close(); }
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}