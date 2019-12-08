package abstractEx;

class FinalEx{
	final public static int AA = 10;
						int aa=100;
}

public class FinalEx2 {

	public static void main(String[] args) {
		FinalEx fe = new FinalEx();
		System.out.println(fe.aa);
		System.out.println(FinalEx.AA);
		
		fe.aa = -100;
		System.out.println(fe.aa);
		//FinalEx.AA = 200; final 이 붙은 변수는 값을 할 당할 수 없다.!!

	}
}
