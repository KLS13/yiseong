package barista;
import Coffees.Coffee;

class Maxim extends Coffees.Coffee{

	@Override
	public String toString() {
		
		return "�ƽ�";
	}
	
}

class Starbucks extends Coffee{
	public String toString() {
		return "����";
	}
}

class Barista {
	
	private String name;
	
	public void naming(String name) {
		this.name = name;
	}
	
	public void enjoyCoffee() {
		System.out.println("Ŀ�� ���ֳ�~!");
	}
	public void drikingCoffee(Coffee coff) {
		System.out.println("Ŀ�Ǵ� ���� " + coff);
	}
}

public class Main {

	public static void main(String[] args) {
		Barista kim = new Barista();
		Maxim max = new Maxim();
		Starbucks star = new Starbucks();
		
		
		kim.naming("��ö��");
		kim.enjoyCoffee();
		Coffee.Smell();
		kim.drikingCoffee(max);
		kim.drikingCoffee(star);

	}

}
