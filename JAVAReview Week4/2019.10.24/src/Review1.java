class Bang <T1, T2> {
	private T1 bang1;
	private T2 bang2;
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("ù��° �� : ").append(bang1).append("\n");
		sb.append("�ι�° �� : ").append(bang2);
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
		return "��������";
	}
}
class Table_2 { 
	@Override
	public String toString() {
		return "Ƽ���̺�";
	}
}
class Desk {
	@Override
	public String toString() {
		return "���̹�å��";
	}
}
class Computer_2 { 
	@Override
	public String toString() {
		return "�Ｚ";
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
