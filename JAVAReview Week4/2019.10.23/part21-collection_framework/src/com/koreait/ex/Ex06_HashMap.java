package com.koreait.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex06_HashMap {

	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<String, Integer>();
		
		//데이터 추가 : put(key, value)
		map.put("alice", 20);
		map.put("james", 25);
		map.put("tom", 20);
		map.put("alice", 21); // key 중복 발생 --> 중복된 key를 삽입하려고 하면, 기존 value를 수정한다.
		
		System.out.println("entry 개수 : " + map.size());		
		// 삭제 
		map.remove("tom");
		
		System.out.println("entry 개수 : " + map.size());
		
		// 반복자는 key를 통해 순회한다.
		// map 에서 key만 빼서 순회한다
		// map의 key를 Set에 저장한다
		
		
		
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		// 한번 순회하고 나면 그 itr은 다시 사용불가 --> 새로 itr값을 받아서 사용해야함.
		
		while(itr.hasNext()) {
			String key = itr.next();
			Integer value = map.get(key);
			System.out.println("키 : " + key + ", 값 : " + value);
		}

	}

}
