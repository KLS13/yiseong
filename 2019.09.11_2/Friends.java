class Doraemong{
	void fly() {
		System.out.println("대나무 헬리콥터");
	}
	void move() {
		System.out.println("어디로든 문!");
	}
	void angry() {
		System.out.println("그정돈 너가 해!");
	}
	void help(String str) { //어떤 부탁이 들어오냐에 따라서 어떤 동작을 수행할지
	//str 에 따라 여러가지 올수있께  " switch "
		switch(str) {
		case "도라에몽 나 하늘을 날고싶어" :
			fly();
		    break;
		
		case "도라에몽 나 과거로 가고 싶어 !" :
			move();
			break;
			
	    default :
	    angry();
		}
	}
}
class Jingoo{ // return : 값 반환/ 메서드 종료
	String wannaFly() {
		return "도라에몽 나 하늘을 날고싶어";
	}
	String wannaMove() {
		return "도라에몽 나 과거로 가고 싶어 !";
	}
	String wannaJavaWell() {
		return "도라에몽 나 자바를 잘하고 싶어!";
	}
}
public class Friends {

	public static void main(String[] args) {
		Doraemong dor = new Doraemong();
		Jingoo jin = new Jingoo();

		dor.help(jin.wannaFly());
		dor.help(jin.wannaMove());
		dor.help(jin.wannaJavaWell());
	}

}
