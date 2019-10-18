package com.koreait.test;

class User {
	
	private String id;
	private String password;
	
	public User(String id, String password) {
		this.id = id;
		this.password = password;
	}
	
	public String toString() {
		String login = "id : " + id + "pw : " + password;
		return login;
	}
/*	
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof User) {
			return id.equals(((User)obj).id) && password.equals(((User)obj).password);
		}else {
			return false;
			
		}
	}
}
*/
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof User) {
			User other = (User) obj;
			return id.equals(other.id) && password.equals(other.password);
		}
		return false;
	}
}
public class Test02 {

	public static void main(String[] args) {

		User user1 = new User("aaaa","dddd");
		User user2 = new User("aaaa","dddd");
		
		if(user1.equals(user2)) {
			System.out.println("동일");
		}else {
			System.out.println("다름");
		}
		System.out.println(user1);
		System.out.println(user2);
	}
}