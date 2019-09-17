//x,y ��ǥ�� ������ �ִ� ��ü(Point)�� �����Ѵ�.
//Cloneable �������̽��� �ƹ� �͵� ��������� �ʰ� �ֵ�.
//Cloneable�� clone�� ����ϰ� ���� Ŭ������ �ʼ������� �ٿ����ϴ� �������̽�(�̰� ��Ģ)
//ǥ�ø� �������� ����ϴ� �������̽� : ��Ŀ �������̽�

class Point implements Cloneable{
	private int xPos;
	private int yPos;

	public Point(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]", xPos, yPos);
		System.out.println(" ");
	}
	//clone()�� ���� protected �� �����ڰ� �پ��ִ� !
	
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	} // ��(this) ��ü�� �����ϴ� �޼���
	  // ���簡 �߸� �� �ÿ��� CloneNotSupportedException ���� �߻�
	
}

public class ObjectClone {

	public static void main(String[] args) {
		Point org = new Point(3,5);
		Point cpy;
		
		//����ó�� �����̴�!
		// try������ ���ܰ� �߻��� �� �ִ� �۾��� �־�ΰ�,
		// catch���� ���ܿ� ���� ó���� �ִ´�
		try {
			//������Ʈ ��ü�� ����Ʈ ���������� ������ �� ����
			// ���� ������Ʈ�� ����Ʈ�� ����� �� ��ȯ���־����
			cpy = (Point)org.clone();
			org.showPosition();
			cpy.showPosition();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
