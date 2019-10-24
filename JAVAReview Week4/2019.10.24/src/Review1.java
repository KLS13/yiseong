class Bang <T1, T2> {
	private T1 bang1;
	private T2 bang2;
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("첫번째 방 : ").append(bang1).append("\n");
		sb.append("두번째 방 : ").append(bang2);
		return sb.toString();
	}
	public void setBang1(T1 bang1) {
		this.bang1 = bang1;
	}
	public void setBang2(T2 bang2) {
		this.bang2 = bang2;
	}
}

class Chair_2 { 
	@Override
	public String toString() {
		return "앱코의자";
	}
}
class Table_2 { 
	@Override
	public String toString() {
		return "티테이블";
	}
}
class Desk {
	@Override
	public String toString() {
		return "게이밍책상";
	}
}
class Computer_2 { 
	@Override
	public String toString() {
		return "삼성";
	}
}

public class Review1 {

	public static void main(String[] args) {
		Bang<Chair_2, Table_2> room1 = new Bang<>();
		Bang<Desk, Computer_2> room2 = new Bang<>();
		
		room1.setBang1(new Chair_2());
		room1.setBang2(new Table_2());
		
		room2.setBang1(new Desk());
		room2.setBang2(new Computer_2());
		
		System.out.println(room1);
		System.out.println(room2);
		

	}

}
