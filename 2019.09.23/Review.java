//���׸��� �ߴ�! (������ ���ø�) - � Ŭ�����̴� �� �� �ִ�.

class Box<T>{
	//�ڽ��� ������ ���� �� �־����� ���ڵ�. (� Ŭ���� �̴��� !!)
	// T : ������ �� �� �ִ� ����
	T obj;
	
	void setBox(T obj) {
		this.obj = obj;
		//�Է¹��� ��ü�� �ڽ��� ����
	}
}
public class Review {

	public static void main(String[] args) {
		Box<String> strBox = new Box<String>();
		Box<Integer> intBox = new Box<Integer>();
		strBox.setBox("�ڹ� ����");
		intBox.setBox(150); //����ڽ�

	}

}
