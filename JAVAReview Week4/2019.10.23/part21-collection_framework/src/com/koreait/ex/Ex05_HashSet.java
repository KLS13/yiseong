package com.koreait.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class User {
	
	// Field
	private String id;
	private String pw;
	
	// Constructor
	public User(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	// Method
	@Override
	public String toString() {
		return "¾ÆÀÌµð : " + id;
	}
	
	@Override
	public int hashCode() {
		return id.charAt(0);
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof User) {
			String otherId = ((User)obj).id;
			return id.equals(otherId);
		}else {
			return false;
		}
	}
	
}

public class Ex05_HashSet {

	public static void main(String[] args) {

		Set<User> set = new HashSet<User>();
		
		set.add( new User("admin", "1234") );
		set.add( new User("admin", "1234") );

		Iterator<User> itr = set.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}















