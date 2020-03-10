package lambda;

public class MyNumTest {

	public static void main(String[] args) {		

		MyMaxNum max = (x,y) -> (x >= y)? x+y:x-y;
		System.out.println(max.getMaxNum(10, 20));
	}

}
