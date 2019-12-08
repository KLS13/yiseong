package PolymorphismExs;

//CalculatorNew ca = new SumNew();
//CalculatorNew ca1 = new SubtractorNew();
//
//CalculatorNew caNew[] = new CalculatorNew[2];
//caNew[0] = new SumNew();
//caNew[1] = new SubtractorNew();

public class PolymorphismEx6 {
	static int i =0;
	static CalculatorNew calArray[] = new CalculatorNew[3]; 
	
	public static void exe(CalculatorNew cal){
		calArray[i++] = cal;
		cal.setNum(100,200);
		cal.calResult();
	}
	public static void main(String[] args) {
		SumNew sum = new SumNew();
		SubtractorNew sub = new SubtractorNew();
		
		exe(sum);
		exe(sub);
		exe(sum);
		exeSequence();		
	}
	
	public static void exeSequence(){
		System.out.println("--------¿¬»ê¼ø¼­---------");
		for (int i=0;i<calArray.length;i++){
			String str = calArray[i].operand();
			System.out.println(str);
		}
	}

}

abstract class CalculatorNew{
	int n1, n2;
	
	public void setNum(int n1, int n2){
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public abstract void calResult();
	public abstract String operand();
}

class SumNew extends CalculatorNew{
	public void calResult(){
		System.out.println(" + °á°ú :"+(this.n1+this.n2));
	}
	public String operand(){
		return "µ¡¼À";
	}
}

class SubtractorNew extends CalculatorNew{
	public void calResult(){
		System.out.println(" - °á°ú :"+(this.n1-this.n2));
	}
	public String operand(){
		return "»¬¼À";
	}
}

