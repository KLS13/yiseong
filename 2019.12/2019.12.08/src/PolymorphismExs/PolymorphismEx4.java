package PolymorphismExs;

public class PolymorphismEx4 {
	public static void main(String[] args) {
		Truck tr = new Truck();
		
		if(tr instanceof Truck){
			System.out.println("Truck Type �̴�");			
		}
		
		if(tr instanceof Car){
			System.out.println("Car Type �̴�");
		}
		
		if(tr instanceof Object){
			System.out.println("Object Type �̴�");
		}		
//		if(tr instanceof FireEngine){			
//		}
	}
}
