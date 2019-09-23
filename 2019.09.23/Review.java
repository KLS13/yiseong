//제네릭을 했다! (일종의 템플릿) - 어떤 클래스이던 올 수 있다.

class Box<T>{
	//박스에 뭐든지 담을 수 있었으면 좋겠따. (어떤 클래스 이던지 !!)
	// T : 뭐든지 올 수 있는 상태
	T obj;
	
	void setBox(T obj) {
		this.obj = obj;
		//입력받은 객체를 박스에 보관
	}
}
public class Review {

	public static void main(String[] args) {
		Box<String> strBox = new Box<String>();
		Box<Integer> intBox = new Box<Integer>();
		strBox.setBox("자바 꿀잼");
		intBox.setBox(150); //오토박싱

	}

}
