class DBox<L, R> {
	private L left;
	private R right;
	public void set(L o, R r) {
		left = o;
		right = r;
	}

	public String toString() {
		return left + "&" + right;
	}
}

public class Generic1 {

	public static void main(String[] args) {
		//Ÿ���� ���ִ� ���� �տ��� �ѹ� ���� ������ ���!
		DBox<String, Integer> box = new DBox<>();
		//DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25); //25�� ����ڽ��� �ȴ�.    
		System.out.println(box);
		
		
		
		
	}

}
