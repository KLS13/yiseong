//'�Ű�����ȭ Ÿ��'�� 'Ÿ������'�� ������.

class Bucket<T>{  //<T>Ÿ�� �Ű�����
	private T ob;
	
	public void set(T ob) {
		this.ob = ob;
	}
	public T get() {
		return this.ob;
	}
}

public class Generic3 {
//�Ű�����ȭ Ÿ�� ���� �ϳ��� Ÿ���̹Ƿ�, ���׸� ����� Ŭ������ ���� ����
	public static void main(String[] args) {
		
		Bucket<String> sBox = new Bucket<>();
		sBox.set("�ڹ� ����");
		
		Bucket<Bucket<String>> wBox = new Bucket<>();
		wBox.set(sBox);
		
		Bucket<Bucket<Bucket<String>>> zBox = new Bucket<>();
		zBox.set(wBox);
		

		System.out.println(zBox.get().get().get());
		
	}

}
