package interfaceExs;

public class InterfaceAuser {
	public static void main(String[] args) {
		A a = new A();
		a.setNumber(10, 20, 100);
		System.out.println("합계 : "+a.sum());
		System.out.println("평균 :"+a.avg());
	}
}

interface Ainterface{
	void setNumber(int n1, int n2, int n3); //abstract public 생략
	int sum();
	int avg();
}

class A implements Ainterface{
	int n1;
	int n2, n3;
	public void setNumber(int n1, int n2, int n3){
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public int sum(){
		return n1+n2+n3;
	}
	public int avg(){
		return (n1+n2+n3)/3;
	}
}
