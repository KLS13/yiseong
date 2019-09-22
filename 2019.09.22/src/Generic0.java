//��ü�� �����ϴ� Ŭ���� Box !
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

class Box{
	private Object ob;
	
	public void set(Object ob) {
		this.ob = ob;
	}
	public Object get() {
		return this.ob;
	}
}

//�Ʒ��� ���� ����� �Ǽ��� ������ ���ɼ��� ��ô ŭ
//���׸��� �ִٸ� �غ� ����
public class Generic0 {

	public static void main(String[] args) {
		
		Box appleBox = new Box();
		Box bananaBox = new Box();
		

	   //  appleBox.set("���"); // ���� �߻�X
	    appleBox.set(new Apple());
	    bananaBox.set(new Banana());
		//public void set(Object ob = new Apple();
		//�������� ���ǰ� ����Ǿ���.  �ڽ� Ŭ���� ��ü�� ������ �� ����..
	    
	    Apple ap = (Apple)appleBox.get();
	    // --> Apple ap = Object; < �������� ���ǰ� ����ȵ�
	    //�ȵǴ°� �ǰ�... ����� ����ȯ
	    // ����� ����ȯ ������ ���ֱ�  ����. �Ǽ�����
	    Banana bn = (Banana)bananaBox.get();
	    
	    System.out.println(appleBox.get());
	    System.out.println(bananaBox.get());
	}
}

