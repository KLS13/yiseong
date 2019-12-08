package interfaceExs;

interface Interface4{
	void a(); //public abstract »ý·«
}

interface Interface5{
	String b();
}

abstract class AbsClass{
	abstract void c();
}

interface InterfaceF extends Interface4, Interface5{
	void d();
}


public class InterfaceEx3 extends AbsClass implements InterfaceF {
	public void c(){
		System.out.println("CCC");
	}	
	public void a(){
		System.out.println("AAA");	}
	public String b(){
		return "BBBB";	}
	public void d(){
		System.out.println("DDDD");	}	
	public static void main(String[] args) {
		InterfaceEx3 in3  = new InterfaceEx3();
		in3.c();
		in3.a();
		System.out.println(in3.b());
		in3.d();	
		
		AbsClass ac = new InterfaceEx3();
		ac.c();
		//ac.b();
		//ac.a();
		//ac.d();
		
		InterfaceF inF = new InterfaceEx3();
		inF.a();
		inF.b();
		//inF.c();
		inF.d();		
		}	

}
