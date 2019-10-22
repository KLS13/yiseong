package com.koreait.ex;

import java.util.ArrayList;
import java.util.List;

public class Ex01_ArrayList {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>(5);
		
		// 1. 저장 : add
		list.add(new Integer(1));
		list.add(new Integer(2));
		list.add(5);
		list.add(4);
		list.add(3);
		
		// 2. 저장된 요소 가져오기 : get
		System.out.println("첫번째 요소 : " + list.get(0));
		System.out.println("두번째 요소 : " + list.get(1));
		
		// 3. 크기 : size
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// 4. 삭제 : remove
			list.remove(0);  //0번 인덱스의 데이터 삭제
			
		// 5. 확인 : contains(객체)
			List<Integer> list2 = new ArrayList<Integer>();
			list2.add(new Integer(5));			
			list2.add(new Integer(6));			
			list2.add(new Integer(7));
			
			for(int i = 0; i<list2.size(); i++) {
				if(list.contains(list2.get(i))) {
					System.out.println(list2.get(i));
				}
			}
		// 6. 최악의 성능이 나타나도록 list의 모든 데이터를 삭제하시오
			while(list.size() > 0) {
				list.remove(0); // 최악
				// list.remove(list.size()-1); // 뒤에서부터 빼면 최고 ~~
			}
			for(int i = 0; i < list.size(); i++) {
				System.out.println(list.get(i));
			}
			
		}

	}

