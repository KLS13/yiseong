class IntTest {
	private int a;
	private int b;
	
	public IntTest(int a, int b) {
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return a + ", " + b; 
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof IntTest) {
			IntTest test = (IntTest)obj;
			return a == test.a && b == test.b;
		}else {
			return false;
		}
	}
	
}

class Num {
	private IntTest myTest;
	private int number;
	
	public Num(int a, int b, int number) {
		myTest = new IntTest(a,b);
		this.number = number;
	}

	public boolean equals(Object obj) {
		if(obj !=null && obj instanceof Num) {
			Num other = (Num)obj;
			myTest.equals(other.myTest);
			return myTest.equals(other.myTest) && number == other.number;
		}else {
			return false;
		}
	}
}

public class Test02 {

	public static void main(String[] args) {
	
		Num num1 = new Num(5,4,5);
		Num num2 = new Num(5,4,5);
		
		if(num1.equals(num2)) {
			System.out.println("동일");
		}else{
			System.out.println("다름");
		}
		
	}

}
