public class StringEquals {
	// == ��񱳿����ڷ� ���ϸ� ����(�޸� �ּ�)�� ���ϴ� ��.
	//Object�� equals�� ��������

	public static void main(String[] args) {
		String str1 = new String("Love Java");
		String str2 = new String("Love Java");
		
		if(str1 == str2)
			System.out.println("Same ReFerence");
		else
			System.out.println("Different ReFerence");
		//���ڿ� Ŭ���� ���ο��� equals�� �̹� �����Ǿ� �ִ�.
		if(str1.equals(str2))
			System.out.println("Same ReFerence");
		else
			System.out.println("Different ReFerence");

	}

}
