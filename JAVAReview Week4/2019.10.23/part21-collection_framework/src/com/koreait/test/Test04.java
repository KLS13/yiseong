package com.koreait.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test04 {

	public static void main(String[] args) {
		
		// Set<Integer> set = new HashSet<Integer>(); //add �� ��ҵ��� ������ �������� ����.
 		Set<Integer> set = new LinkedHashSet<Integer>();  // add �� ��ҵ��� ������ ������.
		
		while(set.size() < 25 )  {  
			set.add((int)(Math.random()*25)+1);
		}
		Iterator<Integer> itr = set.iterator();
		
		int[][] bingo = new int[5][5];
		
		for(int i = 0; i<bingo.length; i++) {
			for(int j=0; j<bingo[i].length; j++) {
				bingo[i][j] = itr.next();
				System.out.print(bingo[i][j] + "\t");

			}
			System.out.println();
			}
		}

	}

