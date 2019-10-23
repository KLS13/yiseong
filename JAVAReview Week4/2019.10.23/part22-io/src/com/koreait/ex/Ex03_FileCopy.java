package com.koreait.ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex03_FileCopy {

	public static void main(String[] args) throws IOException {

		// 원본 소스 파일은 "읽어"들인다.
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("alphabet.txt"));
		
		// 복사본 파일은 "생성"한다.
		FileOutputStream fos = new FileOutputStream("alphabet2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		// int data = bis.read();	// read() 가 -1 일때 끝
		int data;
		while ( (data = bis.read()) != -1 ) {
			bos.write(data);
		}
		
		bis.close();
		bos.close();
		fos.close();	// 불필요 (버퍼 스트림만 닫으면 자동으로 닫힌다
		
	}
}
