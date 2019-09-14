// static : 객체생성하지않아도 접근가능, 모든 객체가 공유
// final : 상수화 ! < 변경할수없다.
          //변수의 상수화 : 값변경 X
          //메서드 상수화 : 오버라이딩 불가
          //클래스 상수화 : 상속 불가

// 다형성 : 참조 변수는 자신의 클래스형 또는 자신보다 상속 관계 아래에 있는 클래스형의 객체 참조
class Water{
	protected String color;
	//클래스 내에서만 접근을 허용한다.
	
	String setColor(String color) {
		this.color = color;
		return this.color;
	}
	
}

class BoriWater extends Water{
	//자식클래스와 부모클래스 is-a 관계형성
	//ex) 보리물은 물이다 
	public String setColor(String color) {
		this.color = color + "색임";
		return this.color;
		
	}
}

public class Review {

	public static void main(String[] args) {
		Water water = new Water();
		System.out.println(water.setColor("투명"));
		BoriWater bwater = new BoriWater();
		System.out.println(bwater.setColor("누런"));
		
		Water wt1 = new Water();
		Water wt2 = new BoriWater();
		// <다형성>
	}

}
