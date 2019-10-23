package com.koreait.ex;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01_FileOutput {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream("alphabet.txt");
			bos = new BufferedOutputStream(fos);
			char ch = 'A';
			while (true) {
				bos.write(ch); 
				if(ch == 'z') {
					break;
				}
				ch++;
			}
			System.out.println("alphabet.txt 파일 생성 !");

	}catch(IOException e) {
		e.printStackTrace();
		}finally {
			try {
			if(bos != null) { bos.close(); }
			if(fos != null) { fos.close(); }
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
		
	}
}
