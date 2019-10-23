package com.koreait.ex;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02_Iterator {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(10);
		
		for(int i = 10; i<=100; i+=10) {
			list.add(i);
		}
		
		//�ݺ��ڸ� ���� list ��ȸ
		Iterator<Integer> itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
