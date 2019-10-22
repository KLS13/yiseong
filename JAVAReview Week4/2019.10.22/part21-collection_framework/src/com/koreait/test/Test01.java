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
		sb.append("제목 : ").append(title).append("\n");
		sb.append("내용 : ").append(content).append("\n");
		sb.append("등록일 : ").append((new SimpleDateFormat("yyyy년 MM월 dd일")).format(register)).append("\n");		// 2019년 10월 22일 
		return sb.toString();
	}
	
}

public class Test01 {

	public static void main(String[] args) {

		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board("공지사항", "공지사항 읽어 봐라") );
		list.add(new Board("알림", "알림 읽어 봐라"));
		list.add(new Board("요청", "요청 읽어 봐라"));
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 게시물 번호는? >> ");
		int idx = scanner.nextInt();
		
		if (idx <= list.size()) {
			list.remove(idx - 1);
		}
		
		System.out.println(list);
		
		scanner.close();
		
	}

}















