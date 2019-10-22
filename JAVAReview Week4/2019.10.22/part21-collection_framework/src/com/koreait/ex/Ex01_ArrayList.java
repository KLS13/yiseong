package com.koreait.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(5);
		
		// 1. ���� : add
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(5);
		list.add(4);
		list.add(3);
		
		// 2. ����� ��� �������� : get
		System.out.println("ù��° ��� : " + list.get(0));
		System.out.println("�ι�° ��� : " + list.get(1));
		
		// 3. ũ�� : size
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 4. ���� : remove
			list.remove(0);  //0�� �ε����� ������ ����
			
		// 5. Ȯ�� : contains(��ü)
			List<Integer> list2 = new ArrayList<Integer>();
			list2.add(new Integer(5));			
			list2.add(new Integer(6));			
			list2.add(new Integer(7));
			
			for(int i = 0; i<list2.size(); i++) {
				if(list.contains(list2.get(i))) {
					System.out.println(list2.get(i));
				}
			}
		// 6. �־��� ������ ��Ÿ������ list�� ��� �����͸� �����Ͻÿ�
			while(list.size() > 0) {
				list.remove(0); // �־�
				// list.remove(list.size()-1); // �ڿ������� ���� �ְ� ~~
			}
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		}

	}

