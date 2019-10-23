package com.koreait.ex;
import java.util.*;

public class Ex04_HashSet {

	public static void main(String[] args) {
			Set<String> set = new HashSet<String>();
			
			set.add("C");
			set.add("Java");
			set.add("DB");
			set.add("JSP");
			set.add("Web");
			set.add("Spring");
			set.add("Java");
			
			Iterator<String> itr = set.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
		}
	}
}
