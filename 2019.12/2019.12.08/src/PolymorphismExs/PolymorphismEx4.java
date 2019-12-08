package PolymorphismExs;

public class PolymorphismEx4 {
	public static void main(String[] args) {
		Truck tr = new Truck();
		
		if(tr instanceof Truck){
			System.out.println("Truck Type 이다");			
		}
		
		if(tr instanceof Car){
			System.out.println("Car Type 이다");
		}
		
		if(tr instanceof Object){
			System.out.println("Object Type 이다");
		}		
//		if(tr instanceof FireEngine){			
//		}
	}
}
