package generic;

public class Powder extends Meterial{

	public String toString() {
		return "재료는 파우더";
	}

	@Override
	public void doPrinting() {
		// TODO Auto-generated method stub
		System.out.println("파우더로 프린팅 합니다 ! ");
	}
}
