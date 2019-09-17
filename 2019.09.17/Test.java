class AAA{
	AAA(){
		//객체가 새롭게 생성될때마다 반드시 호출
		System.out.println("생성!");
	}
	//객체가 사라질때 호출되는 메서드도 있음.
	//finalize();
}
//API
//어플리케이션 프로그래밍 인터페이스
//응용프로그램을 만들 때 쓰면 되는 기능들이 이미 만들어져 있는 것
public class Test {

	public static void main(String[] args) {
		System.out.println("안녕");
	//우리는 println을 만든적이 없지만 이미 주어져있따. API 이다
	//마우스 커서를 위에다 얹어만 두는 것: Hover 한다.
		
		String str = "자바 노잼";
		String lie = new String("자바 최고");
		int a = 3;
		double b = 3.14;
		//int, double은 일반 자료형
		//그러나, String 은 일반자료형이 아닌, 클래스이다 !
		// a,b는 일반변수, str은 참조변수
	}

}
