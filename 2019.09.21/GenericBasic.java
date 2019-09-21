//Generic0 ���� �߰��� ���������� ���׸� ����� Ŭ������ �غ�
class Apple{
	public String toString() {
		return "I am an apple";
	}
}
class Banana{
	public String toString() {
		return "I am a banana";
	}
}
//���׸� ����� Ŭ���� -> T�� �ִ� �ڸ����� ���� ��  ( T ���� ���� �ü������� ���ʰ� T�� )
class Box<T>{
	private T ob;
	
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {
		return this.ob;
	}
}
//������ : ��� ���۰� ó���� Object�� ���缭 ���� �� �ۿ� ����.
// --> �׷��� ���׸� ����� Ŭ������ ���� �ذ� ����

//���׸� ��� Ŭ������ ���
public class GenericBasic {

	public static void main(String[] args) {
		Box<Apple> appleBox = new Box<Apple>(); //Box Ŭ�������� T �κ��� ��� Apple�� �ٲ� ���� ��ü ����
		Box<Banana> bananaBox = new Box<Banana>(); //Box Ŭ�������� T �κ��� ��� Banana�� �ٲ� ���� ��ü ����
		

	    appleBox.set(new Apple()); //����ߴ� Ŭ������ ��ü�� ���� �� �ִٴ� ������ ��Ģ�� ����. 
	    bananaBox.set(new Banana());
	
	   
	    Apple ap = appleBox.get();
	    Banana bn = bananaBox.get();
	    //get�� ���� �� � Ŭ������ �ν��Ͻ��� �������� �������ֵ�.
	    //����, ����� ����ȯ�� ���� �ʿ������ʴ�.
	    
	    System.out.println(appleBox.get());
	    System.out.println(bananaBox.get());

	    //���׸��� ���� ���� �� �ִ� ���� 
	    // 1. �ڵ� ���� ( Ŭ���� �������� ���� �ʿ䰡 ���� )
	    // 2. �Ǽ�(mistake)�� ���� �� �ִ�.

	}

}
