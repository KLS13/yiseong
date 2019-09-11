// 클래스의 멤버로는 인스턴스 멤버와 클래스 멤버가 있다.
// 클래스 안에 있는 멤버끼리는 상호작용이 가능하다.
// 단, 클래스 멤버가 인스턴스 멤버에 접근하는 것은 안됨.
class Seller{
	static String item; // 인스턴스 멤버
	static String job;
	
	static void cheer() {
		System.out.println("전국의 " + job + "여러분 파이팅 ! ");
	} // 클래스 멤버가 클래스 멤버 사용하는것 가능
	
	void introduce() { // 인스턴스 멤버가 클래스 멤버 사용하는것 가능
		System.out.println("저의 직업은" + job + "입니다.");
	}
	void say() {
		System.out.println(item + " 사세요~~~");
	} // 인스턴스 멤버가 인스턴스 멤버 사용하는 것은 "가능"
	static void lie() { // 클래스 멤버로서의 메서드
		System.out.print(item + " 이렇게 팔면 ");
		System.out.println("남는게 없어요~");
	} // 클래스 멤버가 인스턴스 멤버 사용 불가
} 
// 인스턴스 멤버는 객체 생성 시에 메모리 공간을 할당받습니다.
// 반면, 클래스 멤버는 객체 생성 전부터 메모리에 존재합니다.
// 객체 생성하지 않아도 사용할 수 있는 이유
public class Relation {

	public static void main(String[] args) {

		Seller sel = new Seller();

	}

}
