//��ī�� ������! ��ī��� ���ϸ��̴ϱ� 
//���ϸ� �߻�Ŭ������ ��ӹ޾Ƽ� ������!

//���ϸ� �߻�Ŭ������ �����, �װ��� ��ӹ޴� Pikachu�� �����.
abstract class Pokemon{
	abstract void attack();
	abstract void sound();
}
class Pikachu extends Pokemon{
	
	void attack() {
		System.out.println("�������");
	}
	void sound() {
		System.out.println("��ī��ī");
	}
}

class Bulbasaur extends Pokemon{

	void attack() {
		System.out.println("Ǯ�ٰ���");	
	}
	void sound() {
		System.out.println("����~");
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
