class numBox<T>{
	private T ob;
	
	public void set(T ob) {
		this.ob = ob;
		
	}
	public T get() {
		return this.ob;
	}
}

public class Generic2 {
	
	public static void main(String[] args) {
		//기본 자료형은 쓸 수 없다. --> 래퍼 클래스로 대체
		//numBox<int> iBox = new numBox<int>();
		numBox<Integer> iBox = new numBox<Integer>();
		iBox.set(125); // 오토 박싱!  Integer num = 125;
		int num = iBox.get(); // 오토 언박싱
		System.out.println(num);
		
		

	}

}
