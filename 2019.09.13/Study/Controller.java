package Study;

// public : 아무데서나 접근 가능. ( 접근 범위가 가장 넓다 )
// protected : 상속 관계에서만 접근할 수 있다.
// private : 클래스 내에서만 접근가능

class Coffee {
	
	public String nation;
	String name;
	
	Coffee(String nateion, String name){
		this.nation = nation;
		this.name = name; // 생성자는 클래스 내부에 위치해있다.
		// 따라서 private 선언된 멤버에 접근 가능
	}
}

public class Controller {

	public static void main(String[] args) {
	
		
		Coffee maxim = new Coffee("코스타리카","향이 진한원두");
		maxim.nation = "코스타리카"; //public 클래스 내부가 아니더라도 접근 가능

		maxim.name = "향이 진한 원두"; 
		// 클래스 내부가 아니라서 접근불가  private

	}

}
