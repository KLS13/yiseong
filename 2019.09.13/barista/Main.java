package barista;
import Coffees.Coffee;

class Maxim extends Coffees.Coffee{

	@Override
	public String toString() {
		
		return "¸Æ½É";
	}
	
}

class Starbucks extends Coffee{
	public String toString() {
		return "½º¹÷";
	}
}

class Barista {
	
	private String name;
	
	public void naming(String name) {
		this.name = name;
	}
	
	public void enjoyCoffee() {
		System.out.println("Ä¿ÇÇ ¸ÀÀÖ³×~!");
	}
	public void drikingCoffee(Coffee coff) {
		System.out.println("Ä¿ÇÇ´Â ¿ª½Ã " + coff);
	}
}

public class Main {

	public static void main(String[] args) {
		Barista kim = new Barista();
		Maxim max = new Maxim();
		Starbucks star = new Starbucks();
		
		
		kim.naming("±èÃ¶¼ö");
		kim.enjoyCoffee();
		Coffee.Smell();
		kim.drikingCoffee(max);
		kim.drikingCoffee(star);

	}

}
