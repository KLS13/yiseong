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
		//타입을 써주는 것은 앞에다 한번 쓰는 것으로 충분!
		DBox<String, Integer> box = new DBox<>();
		//DBox<String, Integer> box = new DBox<String, Integer>();
		box.set("Apple", 25); //25가 오토박싱이 된다.    
		System.out.println(box);
		
		
		
		
	}

}
