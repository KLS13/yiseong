class INum{
	private int num;
	public INum(int num) {
		this.num = num;
	}
	//�������ϴ°� ����
	// -> '����'��� ���� ��ü�� ����ڰ� ���� �� ����.
	public boolean equals(Object obj) {
		if(this.num == ((INum)obj).num)
			return true;
		else
			return false;
	} 
}
public class ObjectEquals {

	public static void main(String[] args) {
	
		INum num1 = new INum(10);
		INum num2 = new INum(12);
		INum num3 = new INum(10);
		
		//��񱳿����� : �޸� �ּ� ��
		if(num1 == num3)
			System.out.println("����");
		else
			System.out.println("�ٸ�");
		
		//Object equals�� ���� ���ϴ°� �ƴϴ� !
		//�޸� �ּҸ� ����.
		
		if(num1.equals(num3))
			System.out.println("����");
		else
			System.out.println("�ٸ�");
		
		

	}

}
