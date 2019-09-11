class Parents{
	String familyname;
}//Parents를 상속받아 child 클래스를 만들겠다.

class Child extends Parents{
	//child에는 parents의 멤버가 모두 포함.
	
}
// 상속을 사용하는 이유는 코드를 재사용 하고 코드의 중복을 줄이기 위해서.
// 또한 상속되는 항목에 생성자는 포함되지 않는다.
// --> 생성자 이름은 클래스 이름이므로
public class Inheri {

	public static void main(String[] args) {
		Child ch1 = new Child();
		ch1.familyname="aa";
		
		// 부모 클래스로부터 familyname 변수를 물려받았다.
		// 따라서 해당변수 사용 가능.
	}

}
