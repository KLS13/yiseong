//추상 메서드 : 뚜렷하게 정의내려지지 않은 메서드
/* 만들려면 : 선언부만!!  앞에다 abstract
 
abstract void say();
 */
//목적 : 자식클래스가 정의하게끔 강제하는것 
//추상클래스를 상속하는 자식클래스는
//반드시 추상메서드를 오버라이딩 해야한다는 규칙이 있다.
abstract class Boy{
	abstract void sayHello(); // 추상메서드를 하나라도 가지고 있으면 그 클래스는 추상클래스
	// 따라서 클래스 앞에 반드시 abstract를 붙여주어야 한다.
	// 추상클래스로는 객체생성을 해선 안된다.
}


public class Abstract1 {

	public static void main(String[] args) {
		
		//Boy boy1 = new Boy

	}

}
