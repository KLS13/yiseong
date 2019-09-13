package Study;
//상속
//오버라이딩 : 상속받은 메서드를 재정의
//오버로딩 : 같은 이름의 메서드를 매개변수 형태로 달리하여 정의
//상속과 생성자
//자식 클래스의 생성자 첫줄에서는 부모 클래스의 생성자를 호출.

class Medicine {
	String name;
	String effect;
	//생성자 만드는 규칙 : 1.반환형이없음 2.클래스명과 동일한 이름
	
	Medicine(String name, String effect) {
		this.name = name;
		this.effect = effect;
		//반드시 해야하는 것은 아니나, 생성자는 주로 변수의 초기화를 담당.
	}
	String getEffect() {
		return "병이 낫는다 !";
				
	}
}

class Penzal extends Medicine{
	@Override
	String getEffect() {
		
		return "두통에 좋습니다 !";
	} // 물려받은 메서드를 다시 정의했다 ! --> 오버라이딩

	//생성자 규칙을 지켜주지 않아서 에러
	Penzal(String name, String effect){
		super(name,effect);
	}
	// 생성자는 상속받지 않는다.
}
public class Review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
