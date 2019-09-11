//생성자는 객체가 생성될 때 반드시 한 번 호출되는메서드!
// 클래스 내에는 관련있는 기능을 최대한 집어넣어서 만들면 좋음
// 생성자는 일종의 메서드. 따라서 오버로딩이 가능
class Singer{
	String name;
	String song;
	
	Singer(String name, String song){
		this.name=name;
		this.song=song;
	}
	Singer(String name){
		this.name=name;
		this.song= "없음";
	}
	Singer(){
		this.name= "무명";
		this.song= "없음";
	}
	void introduce() {
		System.out.println("저는 가수 " + this.name + " 입니다. 대표곡은 " + this.song + " 입니다.");
	}
}
public class ConstructorEX {


	public static void main(String[] args) {
		
		Singer singer1 = new Singer("동방신기", "허그");
		Singer singer2 = new Singer("HOT", "빛");
		Singer singer3 = new Singer("박효신", "좋은 사람");
		Singer singer4 = new Singer("너훈아");
		Singer singer5 = new Singer();
		
		singer1.introduce();
		singer2.introduce();
		singer3.introduce();
		singer4.introduce();
		singer5.introduce();
		

	}
	// 1.오타   2. 중괄호 짝 안맞는것  3. 파일 생성할 때 실수한 것
	
	//생성자는 객체가 생성될 때 반드시 한 번 호출되는 메서드입니다.
	//주로, 객체의 멤버 변수 초기화에 사용됩니다.
	//메서드 이므로 오버로딩이 가능합니다.
	//반환타입은 쓰지않고, 클래스명과 동일한 이름을 씁니다.
	//this라는 키워드는 생성되는 객체 '그 자신'을 의미.

}
