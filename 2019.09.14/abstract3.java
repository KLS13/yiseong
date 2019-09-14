//피카츄 만들자! 피카츄는 포켓몬이니까 
//포켓몬 추상클래스를 상속받아서 만들자!

//포켓몬 추상클래스로 만들고, 그것을 상속받는 Pikachu를 만들기.
abstract class Pokemon{
	abstract void attack();
	abstract void sound();
}
class Pikachu extends Pokemon{
	
	void attack() {
		System.out.println("전기공격");
	}
	void sound() {
		System.out.println("피카피카");
	}
}

class Bulbasaur extends Pokemon{

	void attack() {
		System.out.println("풀잎공격");	
	}
	void sound() {
		System.out.println("씨씨~");
	}
}
public class abstract3 {

	public static void main(String[] args) {
		Pikachu pika = new Pikachu();
		pika.attack();
		pika.sound();
		
		Bulbasaur bul = new Bulbasaur();
		bul.attack();
		bul.sound();
		
		
	}

}
