//x,y 좌표를 가지고 있는 객체(Point)를 복사한다.
//Cloneable 인터페이스는 아무 것도 상속해주지 않고 있따.
//Cloneable은 clone을 사용하고 싶은 클래스에 필수적으로 붙여야하는 인터페이스(이건 규칙)
//표시를 목적으로 사용하는 인터페이스 : 마커 인터페이스

class Point implements Cloneable{
	private int xPos;
	private int yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println(" ");
	}
	//clone()은 원래 protected 로 제어자가 붙어있다 !
	
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	} // 이(this) 객체를 복사하는 메서드
	  // 복사가 잘못 될 시에는 CloneNotSupportedException 예외 발생
	
}

public class ObjectClone {

	public static void main(String[] args) {
		Point org = new Point(3,5);
		Point cpy;
		
		//예외처리 구문이다!
		// try문에는 예외가 발생할 수 있는 작업을 넣어두고,
		// catch에는 예외에 대한 처리를 넣는다
		try {
			//오브젝트 객체는 포인트 참조변수가 참조할 수 없다
			// 따라서 오브젝트를 포인트로 명시적 형 변환해주어야함
			cpy = (Point)org.clone();
			org.showPosition();
			cpy.showPosition();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
