package com.koreait.ex;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex04_File {

	public static void main(String[] args) {
		
		File file = null;		// File 클래스를 추가하면 파일 관련 메소드를 사용할 수 있다.
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
			
			// File 클래스 사용으로 사용이 가능한 메소드
			System.out.println("파일명 : " + file.getName());
			System.out.println("경로1 : " + file.getAbsolutePath());
			System.out.println("경로2 : " + file.getPath());
			if (file.exists()) {
				System.out.println("파일이 있습니다.");
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
