class Cal{
	int add;
	int sub;
	int mul;
	int div;
		
	void init(){
		int add=0;
		int sub=0;
		int mul=0;
		int div=0;	
	}
	
	double Add(double a, double b) {
		add+=1;
	     return a+b; //return은 값을 반환하면서, 메서드를 끝내기때문에 마지막  
	}
	
	double Sub(double a, double b) {
		sub+=1;
	     return a-b;   
	}
	
	double Mul(double a, double b) {
		mul+=1;
	     return a*b;
	}
	
	double Div(double a, double b) {
		div+=1;
	     return a/b;
	}
	
	void ShowOpcnt() {
		System.out.println("더하기는" + add + "번");
		System.out.println("뺄셈은 " + sub + "번");
		System.out.println("곱셉은 " + mul + "번");
		System.out.println("나눗셈은" + div + "번");
		System.out.println("총 횟수는 "+ (add+sub+mul+div) + "번");
	}
}

public class Calculator {
	
	public static void main(String[] args) {
	
		Cal cal = new Cal();
		cal.init();
		System.out.println("3.2 + 2.4 = " + cal.Add(3.2, 2.4));
		System.out.println("3.2 - 2.4 = " + cal.Sub(3.2, 2.4));
		System.out.println("3.2 * 2.4 = " + cal.Mul(3.2, 2.4));
		System.out.println("3.2 / 2.4 = " + cal.Div(3.2, 2.4));
		cal.ShowOpcnt();
	}

}
