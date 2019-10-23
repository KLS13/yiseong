package com.koreait.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test03 {
	
	public static void main(String[] args) {
		
		Set<Integer> set = new HashSet<Integer>();
		
		
		for(int i =0 ; i <6; i++) {
			int random = (int)(Math.random()*45)+1;
			if(set.contains(random)) {
				i--;
			}else {
				set.add(random);
			}
		}
	
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}
}

/*
 public class Test03 {

	public static void main(String[] args) {

		// 1. ·Î¶Ç
		Set<Integer> set = new LinkedHashSet<Integer>();
		
		while (set.size() < 6) {
			set.add( (int)(Math.random() * 45) + 1 );
		}
		
		int[] lotto = new int[6];
		int i = 0;
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			lotto[i++] = itr.next();
		}
		
		System.out.println(Arrays.toString(lotto));
		}
	}
*/
