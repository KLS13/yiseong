package com.koreait.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {

	public static void main(String[] args) {
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			bis = new BufferedInputStream(new FileInputStream("eclipse.zip"));
			bos = new BufferedOutputStream(new FileOutputStream("eclipse2.zip"));
			
			byte[] buffer = new byte[1024];		// 1024 바이트 = 1KB (킬로바이트)

			long start = System.currentTimeMillis();
			while (bis.read(buffer) != -1) {
				bos.write(buffer);
			}
			long end = System.currentTimeMillis();
			System.out.println("복사시간 = " + (end - start) + "밀리초");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bos != null) bos.close();
				if (bis != null) bis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}
