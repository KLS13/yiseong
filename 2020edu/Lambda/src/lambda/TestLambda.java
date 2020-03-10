package lambda;

interface Print {
	void showPrint(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		
		Print lambdaStr = s-> System.out.println(s);
		lambdaStr.showPrint("LAMBDATEST");
	
		Print test = returnString();
		showMyString(lambdaStr);
		
		test.showPrint("test");
		
	}

	public static void showMyString(Print p) {
		p.showPrint("Test");
	}
	
	public static Print returnString() {
		return s-> System.out.println(s + "!!!");
	}
}
