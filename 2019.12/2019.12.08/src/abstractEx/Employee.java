package abstractEx;

abstract public class Employee {

	String name;
	
	public Employee(String name){
		this.name =name; 
	}
	
	abstract public int income();
	
	public void getInfo(){
		System.out.println("�̸� :"+name+" ���� :"+income());
	}

}
