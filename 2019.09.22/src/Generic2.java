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
		//�⺻ �ڷ����� �� �� ����. --> ���� Ŭ������ ��ü
		//numBox<int> iBox = new numBox<int>();
		numBox<Integer> iBox = new numBox<Integer>();
		iBox.set(125); // ���� �ڽ�!  Integer num = 125;
		int num = iBox.get(); // ���� ��ڽ�
		System.out.println(num);
		
		

	}

}
