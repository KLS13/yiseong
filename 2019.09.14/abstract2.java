abstract class Dog{
	abstract void grrr(); // 문법적으로, 재정의 해야한다는 강제성이 생김.
}

class Foodle extends Dog{

	@Override
	void grrr() {
		System.out.println("으르렁");
		
	}
	//꼭 정의해야하는 메서드를 놓치고 지나칠 수 있따. (위험성)
}
public class abstract2 {

	public static void main(String[] args) {
	

	}

}
