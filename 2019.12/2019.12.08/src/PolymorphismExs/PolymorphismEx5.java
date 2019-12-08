package PolymorphismExs;

public class PolymorphismEx5 {

	public static void exe(Calculator cal){
		cal.setNum(100,200);
		cal.calResult();
	}
	
	public static void main(String[] args) {
		Calculator c1 = new Sum();
		Calculator c2 = new Subtractor();
		
		exe(c1);
		exe(c2);
		
//		Sum sum = new Sum();
//		sum.setNum(100,200);
//		sum.calResult();
//		
//		Subtractor sub = new Subtractor();
//		sub.setNum(100, 200);
//		sub.calResult();
	}

}

abstract class Calculator{
	int n1, n2;
	
	public void setNum(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public abstract void calResult();	
}

class Sum extends Calculator{
	public void calResult(){
		System.out.println(" + 결과 :"+(this.n1+this.n2));
	}
}

class Subtractor extends Calculator{
	public void calResult(){
		System.out.println(" - 결과 :"+(this.n1-this.n2));
	}
}
