package com.koreait.ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Ex06_HashMap {

	public static void main(String[] args) {
		Map<String, Integer>map = new HashMap<String, Integer>();
		
		//������ �߰� : put(key, value)
		map.put("alice", 20);
		map.put("james", 25);
		map.put("tom", 20);
		map.put("alice", 21); // key �ߺ� �߻� --> �ߺ��� key�� �����Ϸ��� �ϸ�, ���� value�� �����Ѵ�.
		
		System.out.println("entry ���� : " + map.size());		
		// ���� 
		map.remove("tom");
		
		System.out.println("entry ���� : " + map.size());
		
		// �ݺ��ڴ� key�� ���� ��ȸ�Ѵ�.
		// map ���� key�� ���� ��ȸ�Ѵ�
		// map�� key�� Set�� �����Ѵ�
		
		
		
		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		// �ѹ� ��ȸ�ϰ� ���� �� itr�� �ٽ� ���Ұ� --> ���� itr���� �޾Ƽ� ����ؾ���.
		
		while(itr.hasNext()) {
			String key = itr.next();
			Integer value = map.get(key);
			System.out.println("Ű : " + key + ", �� : " + value);
		}

	}

}
