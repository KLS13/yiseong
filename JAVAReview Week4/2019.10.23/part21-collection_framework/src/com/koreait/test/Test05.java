package com.koreait.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// HashMap 사용을 위해선
// 중복 데이터 저장 방지를 위해
// hashCode(), equals() 메소드를 오버라이드 해야 한다.

class Member {
	
	// Field
	private int no;
	private String name;
	private String memberShip;
	
	// Constructor
	public Member(int no, String name, String memberShip) {
		this.no = no;
		this.name = name;
		this.memberShip = memberShip;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((memberShip == null) ? 0 : memberShip.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + no;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Member))
			return false;
		Member other = (Member) obj;
		if (memberShip == null) {
			if (other.memberShip != null)
				return false;
		} else if (!memberShip.equals(other.memberShip))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (no != other.no)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Member [no=" + no + ", name=" + name + ", memberShip=" + memberShip + "]";
	}	
}

public class Test05 {

	public static void main(String[] args) {
		
		Map<Member,	Integer> map = new HashMap<Member,Integer>();
		
		map.put(new Member(1, "alice", "VIP"),100);
		map.put(new Member(2, "james", "Gold"),90);
		map.put(new Member(3, "tom", "Silver"), 80);
		map.put(new Member(3, "tom", "Silver"), 10);
		
		Set<Member> set = map.keySet();
		Iterator<Member> itr = set.iterator();
		
		while(itr.hasNext()) {
			Member key = itr.next();
			Integer point = map.get(key);
			System.out.println(key);
			System.out.println("위 회원의 포인트 : " + point);
		}
	}
}
