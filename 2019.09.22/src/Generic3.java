//'매개변수화 타입'을 '타입인자'로 전달함.

class Bucket<T>{  //<T>타입 매개변수
	private T ob;
	
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {
		return this.ob;
	}
}

public class Generic3 {
//매개변수화 타입 역시 하나의 타입이므로, 제네릭 기반의 클래스에 전달 가능
	public static void main(String[] args) {
		
		Bucket<String> sBox = new Bucket<>();
		sBox.set("자바 극혐");
		
		Bucket<Bucket<String>> wBox = new Bucket<>();
		wBox.set(sBox);
		
		Bucket<Bucket<Bucket<String>>> zBox = new Bucket<>();
		zBox.set(wBox);
		

		System.out.println(zBox.get().get().get());
		
	}

}
