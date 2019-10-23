package com.koreait.ex;

import java.util.*;

public class Ex03_LinkedList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		Scanner input = new Scanner(System.in);
		for(int i = 0 ; i<3; i++) {
			System.out.print("이름 입력 >> ");
			String name = input.next();
			list.add(name);
		}
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}